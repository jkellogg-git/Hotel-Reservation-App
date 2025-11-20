package edu.wgu.d387_sample_code.convertor;

import edu.wgu.d387_sample_code.entity.RoomEntity;

import edu.wgu.d387_sample_code.model.Links;
import edu.wgu.d387_sample_code.model.Self;
import edu.wgu.d387_sample_code.model.response.ReservableRoomResponse;
import edu.wgu.d387_sample_code.rest.ResourceConstants;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Component
public class RoomEntityToReservableRoomResponseConverter implements Converter<RoomEntity, ReservableRoomResponse>{

	@Override
	public ReservableRoomResponse convert(RoomEntity source) {
		// TODO Auto-generated method stub
		
		ReservableRoomResponse reservationResponse = new ReservableRoomResponse();
		if(null != source.getId())
			reservationResponse.setId(source.getId());
		reservationResponse.setRoomNumber(source.getRoomNumber());
		reservationResponse.setPrice( Integer.valueOf(source.getPrice()) );

        Map<String, String> prices = new HashMap<>();
        NumberFormat usdFormat = NumberFormat.getCurrencyInstance(Locale.US);
        Currency usd = Currency.getInstance("USD");
        usdFormat.setCurrency(usd);
        prices.put("USD", usdFormat.format(Double.parseDouble(source.getPrice())));

        NumberFormat cadFormat = NumberFormat.getCurrencyInstance(Locale.CANADA);
        Currency cad = Currency.getInstance("CAD");
        cadFormat.setCurrency(cad);
        double cadPrice = Double.parseDouble(source.getPrice()) * 1.38;
        prices.put("CAD", cadFormat.format(cadPrice));

        NumberFormat eurFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        Currency eur = Currency.getInstance("EUR");
        eurFormat.setCurrency(eur);
        double eurPrice = Double.parseDouble(source.getPrice()) * 0.85;
        prices.put("EUR", eurFormat.format(eurPrice));

        reservationResponse.setPrices(prices);
		
		Links links = new Links();
		Self self = new Self();
		self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
		links.setSelf(self);
		
		reservationResponse.setLinks(links);
		
		return reservationResponse;
	}

	
	
}

package com.zang.api.json;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import com.zang.api.configuration.ZangConstants;

public class JsonDateParser extends JsonDeserializer<Date> {
	@Override
	public Date deserialize(JsonParser jsonparser,
			DeserializationContext deserializationcontext) throws IOException,
			JsonProcessingException {
		String date = jsonparser.getText();
		if (date == null)
			return null;
		try {
			return ZangConstants.jsonDateFormat.parse(date);
		} catch (ParseException e) {
			return null;
		}

	}
}

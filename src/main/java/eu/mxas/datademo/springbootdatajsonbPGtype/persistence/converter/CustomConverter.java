//package eu.mxas.datademo.springbootdatajsonbPGtype.persistence.converter;
//
//import jakarta.persistence.AttributeConverter;
//import jakarta.persistence.Converter;
//
//@Converter(autoApply = true)
//public class CustomConverter implements AttributeConverter<String, String> {
//
//	@Override
//	public String convertToDatabaseColumn(String attribute) {
//		return attribute;
//	}
//
//	@Override
//	public String convertToEntityAttribute(String dbData) {
//		return dbData;
//	}
//}
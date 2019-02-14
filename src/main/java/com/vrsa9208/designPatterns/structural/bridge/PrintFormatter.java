package com.vrsa9208.designPatterns.structural.bridge;

import java.util.List;

public class PrintFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append(header);
		builder.append(System.lineSeparator());
		
		for(Detail detail : details) {
			builder.append(detail.getLabel());
			builder.append(": ");
			builder.append(detail.getValue());
			builder.append(System.lineSeparator());
		}
		
		return builder.toString();
	}

}

package com.vrsa9208.designPatterns.structural.bridge;

import java.util.List;

public interface Formatter {
	String format(String header, List<Detail> details);
}

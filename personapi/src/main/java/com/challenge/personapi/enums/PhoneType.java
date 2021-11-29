package com.challenge.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PhoneType {
	
	HOME("Home"),
	MOBILE("Mobile"),
	COMMERCIAL("Commercial");
	
	private final String description;
}

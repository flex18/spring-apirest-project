package com.roca.spring.apirest.project.auth;

public class JwtConfig {	
	
	
	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEA8DaUBN5sGrfZDcb5e1X9ExH+J14++GbsH6tYseNgpmLpQTJb\r\n" + 
			"OgTZnIjL1NuK/Hylt0elJ8+ViPFgt05kHxspyl+RJPZNVLqRNTygnwMe7P3C7wwN\r\n" + 
			"29MVBen+WAL4eL80aJEkV0r01h6Gn3flwZZdXpz2gGZmzDThB7MQ3JJ8B92M/DL6\r\n" + 
			"7h+cUfXEZrvhKMO2mwLsW8CRoLM5nUL5wABYd1s0Er9kMKy0xXQkVkISHudSajgX\r\n" + 
			"YQjnxYGSXp7dgzTJjtMqjWNEkdlGkq+WiLYVPVZSUbLhihGG0HwqSlW68MleQRiT\r\n" + 
			"HWm9H+olFGHW2JZsIJ7otdkC52bHmcI1uk1IPwIDAQABAoIBAF0SuJ1+VOKxU2+M\r\n" + 
			"JgRM2Ab4lMJKORnkPx8yM+aRFFTDxF8XlNNRJ8QIGPo7qomT/l2aa/qV6vmplPDR\r\n" + 
			"dee7jaC1ELcCnAn1U+gNuqqB+gyXcl1PDVucWOv2sy8Ez6NxamwNuMf96gnAwCav\r\n" + 
			"vR0aFslfBf/QLYp3/q0OC717IIWm6QXT6+1rOSzq0qxo+UEmXzmw5XP82UwSoIzf\r\n" + 
			"1XO5QOYpX0ue6yALYqPdcp7Fp1As6bLonEwiIQG0MzEsPZpD3hOjYWjhTebCNVZg\r\n" + 
			"wPDjT8IaeSBtQVH8ut3iNvO/1O6Z60VkxnnOxzjIt5/S2Vvvm8yKf3qA/l+jXojQ\r\n" + 
			"rrg+QIECgYEA/3DRXaLeHFGmhmhp2sch29T8YpVU39g2s87WeNUmMtjPHkdHE7B7\r\n" + 
			"S++bgz01UkgQyAAEcBcHTOa9W+OVMPILpUDg7WYi3fzYiCwW2cioto5bE3drNK0p\r\n" + 
			"mkhwsl7oe5gdfEkQ7uiSf5TXruI1ubAh7mLbAEHzckBNstVQJ3Yqa8ECgYEA8L05\r\n" + 
			"krcLwm/fI8oKjONDoQF8MCQ3UW9Tg84eFhPyhyI4HI9AO8iaeOHxcfHCZbZQExyp\r\n" + 
			"ZLkw5/HwfeyxRYI3FMOFuyOyF5pQlA1vTI59KtmqC/EmrlUWVKWsbn5oSmGa6rJB\r\n" + 
			"VEY1a/FcHPgWgeJ4LwX0viFnrak1JXXjXdm0s/8CgYEAwowwSTqUI8lkJRY9GO11\r\n" + 
			"MjLjDkph3CKWdxffbSQZ9bv+8zaiQbK2FT2mmavygnp0nX614pEHdGCAdA2/QQn4\r\n" + 
			"KKJjLSwO/jdmyz+ZH8GeDXwajZb0Rahk+SaW/qMeOZO/UTts9CiZ+yVnp8CN3qDx\r\n" + 
			"Ftifp3CTc77Z7oxcgdGTuYECgYB8FNv+3e/muOinNrT3Zw/thalv2srUY3AFSJDD\r\n" + 
			"Sma/9gg72C4AYmYUFkjvNO/AoxZks2ov6y/k7RPKo9u++t3PCvP7v+tENRqBJOeP\r\n" + 
			"6wVit6vo2dPZGSwYVwgoL2krpWFGxLfdaw6P42hZ2hknuwW9HvHFqcwZe1RUSY32\r\n" + 
			"SobUGwKBgQCs5cVJlYb/umQUk8U+idZXCs3sonYl966LA4x+sfoYswV1yAPrgES3\r\n" + 
			"XfwGQnyubak/zGyeCQ2T2ph1AZGGN0QDAhImjzLDrmyABr058Mdy/PqDEQZ7Jwkl\r\n" + 
			"YToIM/bGI4J8bouxJfTEo4n2ZI+FlY9uNV3BwH9zQrW/m6S8lhK0mA==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	
	public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA8DaUBN5sGrfZDcb5e1X9\r\n" + 
			"ExH+J14++GbsH6tYseNgpmLpQTJbOgTZnIjL1NuK/Hylt0elJ8+ViPFgt05kHxsp\r\n" + 
			"yl+RJPZNVLqRNTygnwMe7P3C7wwN29MVBen+WAL4eL80aJEkV0r01h6Gn3flwZZd\r\n" + 
			"Xpz2gGZmzDThB7MQ3JJ8B92M/DL67h+cUfXEZrvhKMO2mwLsW8CRoLM5nUL5wABY\r\n" + 
			"d1s0Er9kMKy0xXQkVkISHudSajgXYQjnxYGSXp7dgzTJjtMqjWNEkdlGkq+WiLYV\r\n" + 
			"PVZSUbLhihGG0HwqSlW68MleQRiTHWm9H+olFGHW2JZsIJ7otdkC52bHmcI1uk1I\r\n" + 
			"PwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}

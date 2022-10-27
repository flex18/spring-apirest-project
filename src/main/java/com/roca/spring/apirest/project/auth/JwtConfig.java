package com.roca.spring.apirest.project.auth;

public class JwtConfig {
	
	public static final String RSA_PUBLIC = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCyUy5ed6WRAMimwJFFX5holHXQWkokRSXKE0pgVZy4sjsFyWCU1CkfV+fCqi22YETCzX0dQxJE+KUFcVSHWk2HWSjWMudlFOspr6MsSBLZ2zyh2OjYhfQXvBxmOJD5GtP6YalFUpHo8fF5vP9xY1QJRFzk5UhLScOZLBnyKZN1m/jd7uI/F6066Z2SQPpv3Tqac4+fCad4eaH1bDPHFVvccUFlIHf28jxU/7x+o+GSoHjuqg3vtjYzXwkv/xeEzJmK6SjCp2E2kb7NV9Qef8M5js4tttGWY4Te0Ud9FKHc7EN44cPx/SGm4v93UecVgia3rnqdGDaMwiplrVEioMAzgwwBx4gVvWwuFO5+pCn7oRKF3OMTr4aXUbSbJ2W1iWjfimJODfP/nhHzvBGhzGRjveBRgeBIMJDWARcIBh9aGJfyIG+xEND34QM6CGRE8AtLQnra9iZiauIO+53FHtOpfCIYMc7mQZTg5v1GowfoZ9j6Mxluyl22cEj47T8HmricBv2DqAOf2O+HV0aLHQhsyi2LgShq8dH65WvYNTjHrNqGo7hrU6okBqKgJev4Zr1QE8UVmi/kSYOlPpOnDOikN88d6Z7z4nNMkRMmrxgUoZ+FBPEfq9Bocw/arbl07AfYPez6+2epPNYR/SosyfG6ReXll1Xw7KYQ7msC9rQnzw== MI PC@MENDOZA";
	
	public static final String RSA_PRIVATE = "-----BEGIN OPENSSH PRIVATE KEY-----\r\n"
			+ "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\r\n"
			+ "NW0Lm9ZhMT1ayqSF4Vy+lqtug=\r\n"
			+ "-----END OPENSSH PRIVATE KEY-----";

}

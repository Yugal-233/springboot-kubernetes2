package com.k8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8sDemo {

	@GetMapping("/k8s")
	public String getK8s() {
		return "K8s is working successfully";
	}
}

package com.dute.officialNetwork;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dute.officialNetwork.domain.entity.CustomerInformation;
import com.dute.officialNetwork.service.interfaces.CustomerInformationService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OfficialNetworkApplicationTests {

	@Autowired
	CustomerInformationService cis;

	@Test
	public void contextLoads() {
		String str = "";
		String startTime = "2018-06-26 23:28:13";
		String endTime = "2018-06-26 23:28:15";
		try {
			Page<CustomerInformation> pci = cis.findAll(str, startTime, endTime, PageRequest.of(0, 12));
			for (CustomerInformation ci : pci.getContent()) {
				System.out.println(ci.getProblemDescription());
				System.out.println(ci.getCreateTime());
				System.out.println("=================================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

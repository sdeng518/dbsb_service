package com.sysnet.dbsb.ws.plicc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WSClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebServiceInterfaceService service = new WebServiceInterfaceService();
		WebServiceInterface portType = service.getWebServiceInterfacePort();

		try {
			File file = new File("d:\\xml.xml");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String temp = null;
			StringBuffer sb = new StringBuffer();
			temp = br.readLine();
			while (temp != null) {
				sb.append(temp);
				temp = br.readLine();
			}

			String resultString = portType.excute(sb.toString());
			System.out.println(resultString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getXml() {
		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext(
		// "applicationContext.xml");
		// PersonDAOImpl dao = (PersonDAOImpl) applicationContext
		// .getBean("personDao");
		// FeeSettlementDAOImpl settlementDAO = (FeeSettlementDAOImpl)
		// applicationContext
		// .getBean("feeSettlemeDao");
		// RegistrationDAOImpl registrationDAO = (RegistrationDAOImpl)
		// applicationContext
		// .getBean("registraDao");
		// HospitalItemDAOImpl itemDAO = (HospitalItemDAOImpl)
		// applicationContext
		// .getBean("itemDao");
		//
		// String updateFlag = "0";
		// List personsList = dao.getInsurancList(updateFlag);
		// for (int i = 0; i < personsList.size(); i++) {
		// Map map = (Map) personsList.get(i);
		// BigDecimal personNoString = (BigDecimal) map.get("D506_05");
		// String seqId = (String) map.get("D506_01");
		// // String seqId = "08a463e1-36bf-463e-a633-a92a8225325e";
		// HospitalRegistration registration = registrationDAO
		// .getRegistrationBySeqId(seqId);
		// List<HospitalItem> items = itemDAO.getItemsBySeqId(seqId);
		// HospitalFeeSettlement settlement = settlementDAO
		// .getSettlementBySeqId(seqId);
		// HospitalFeeSettlementInfo settlementInfo = new
		// HospitalFeeSettlementInfo();
		// settlementInfo.setHospitalRegistration(registration);
		// settlementInfo.setHospitalFees(items);
		// settlementInfo.setHospitalFeeSettlement(settlement);
		//
		// String xmlString = new MessageBuilder()
		// .buildRequest(settlementInfo);
		// System.out.println(xmlString);
		// FileUtil.writeAsString(new File("d:\\xml.xml"), xmlString);
		// // WebServiceInterfaceService service = new
		// // WebServiceInterfaceService();
		// // WebServiceInterface portType =
		// // service.getWebServiceInterfacePort();
		// // String resultString = portType.excute(xmlString);
		//
		// // System.out.println(resultString);
		// }

	}
}

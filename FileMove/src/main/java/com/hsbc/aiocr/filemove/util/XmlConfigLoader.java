package com.hsbc.aiocr.filemove.util;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.hsbc.aiocr.filemove.entity.Country;
import com.hsbc.aiocr.filemove.entity.CountryEntity;
import com.hsbc.aiocr.filemove.entity.ProcessTypeCfg;
import com.hsbc.aiocr.filemove.entity.TranChannel;
import com.hsbc.aiocr.filemove.entity.TranChannelCfg;

public class XmlConfigLoader {
	public TranChannelCfg loadTranChannelCfg() {
		SAXReader reader = new SAXReader();
		File file = new File("Setting.xml");
		TranChannelCfg cfg = null;
		try {
			Document document = reader.read(file);
			Element root = document.getRootElement();
			List<Element> tranChannelElements = root.elements("TranChannel");
			cfg = new TranChannelCfg();
			for(Element tranChannelElement : tranChannelElements) {
				TranChannel tranChannel = new TranChannel();
				tranChannel.setRegion(tranChannelElement.attributeValue("regtion"));
				tranChannel.setTargetPath(tranChannelElement.attributeValue("targetPath"));
				
				for(Object subObjLv1 : tranChannelElement.elements()) {
					Element tmpEleLv1 = (Element)subObjLv1;
					System.out.println(tmpEleLv1.getName());
					if(tmpEleLv1.getName().equalsIgnoreCase("CountryEntities")) {
						for(Object subObjLv2 : tmpEleLv1.elements("CountryEntity")) {
							Element tmpEleLv2 = (Element)subObjLv2;
							CountryEntity countryEntity = new CountryEntity();
							countryEntity.setFilePrefix(tmpEleLv2.attributeValue("filePrefix"));
							countryEntity.setCountryCode(tmpEleLv2.attributeValue("countryCode"));
							countryEntity.setEntityName(tmpEleLv2.attributeValue("entityName"));
							countryEntity.setProcessTypeIDs(tmpEleLv2.attributeValue("processTypeIDs"));
							tranChannel.getCountryEntities().add(countryEntity);
						}
					}else if(tmpEleLv1.getName().equalsIgnoreCase("Countries")) {
						for(Object subObjLv2 : tmpEleLv1.elements("Country")) {
							Element tmpEleLv2 = (Element)subObjLv2;
							Country country = new Country();
							country.setCountryCode(tmpEleLv2.attributeValue("countryCode"));
							country.setFilePrefix(tmpEleLv2.attributeValue("filePrefix"));
							country.setProcessTypeIDs(tmpEleLv2.attributeValue("processTypeIDs"));
							tranChannel.getCountries().add(country);
						}
					}
				}
				cfg.getTranChannels().add(tranChannel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cfg;
	}
	
	public ProcessTypeCfg loadProcessTypeCfg() {
		return null;
	}
}

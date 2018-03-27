package com.traning;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionTest {
	
	private List<String> nameList;
	private Set<String>  nameSet;
	private Map<Integer,String> nameMap;
	private Properties nameProp;
	public List<String> getNameList() {
		return nameList;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	public Set<String> getNameSet() {
		return nameSet;
	}
	public void setNameSet(Set<String> nameSet) {
		this.nameSet = nameSet;
	}
	public Map<Integer, String> getNameMap() {
		return nameMap;
	}
	public void setNameMap(Map<Integer, String> nameMap) {
		this.nameMap = nameMap;
	}
	public Properties getNameProp() {
		return nameProp;
	}
	public void setNameProp(Properties nameProp) {
		this.nameProp = nameProp;
	}

}

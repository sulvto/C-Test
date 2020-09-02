package me.qinchao.pss.query;

import org.apache.commons.lang3.StringUtils;

public class ProductTypeQuery extends BaseQuery {
	private String name;

	public ProductTypeQuery() {
		super("ProductType");
	}

	@Override
	public void addWhere() {
//		System.out.println("dept " + dept);
		if (StringUtils.isNotBlank(name)) {
			addWhere(" o.name like ? ", "%" + name + "%");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "ProductTypeQuery [name=" + name  + "]";
	}

}
package com.gp.market.operationSQL.inference;

import java.util.List;

public interface Select {
	List<Object> select();

	List<Object> select(Object a);

	List<Object> select(Object a, Object b);
}

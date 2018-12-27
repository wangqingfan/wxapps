package com.beixiao.sharding.algorithm.table.version203;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

public class TStudentTableStrategy implements PreciseShardingAlgorithm<Integer>{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public String doSharding(Collection<String> tableNames,
			PreciseShardingValue<Integer> shardingValue) {
		for (String each : tableNames) {  
          if (each.endsWith(("0".concat(String.valueOf(shardingValue.getValue() % 2))))) {
        	  logger.info("----TUserTableStrategy----target:"+each);
              return each;  
          }  
      }  
      throw new IllegalArgumentException();  
	}
}

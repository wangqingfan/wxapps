package com.beixiao.sharding.algorithm.database.version203;

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TUserDataBaseStrategy implements PreciseShardingAlgorithm<Integer>{

	 private final Logger logger = LoggerFactory.getLogger(this.getClass());

	 /**
	 * 数据库数目
	 */
	private static final int SHARDING_NUMBER = 2;
	    
	@Override
	public String doSharding(Collection<String> availableTargetNames,PreciseShardingValue<Integer> shardingValue) {
		 for (String each : availableTargetNames) {
	            if (each.endsWith(shardingValue.getValue() % SHARDING_NUMBER + "")) {
	                logger.debug("the target database name: {}", each);
	                return each;
	            }
	        }
	        throw new UnsupportedOperationException();
	}
}

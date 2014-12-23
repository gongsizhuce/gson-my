/**
 * @ProjectName: gson-vip
 * @Copyright: 版权所有 Copyright © 2001-2012 cqvip.com Inc. All rights reserved. 
 * @address: http://www.cqvip.com
 * @date: 2014年12月19日 下午2:29:48
 * @Description: 本内容仅限于维普公司内部使用，禁止转发.
 */
package com.google.gson.internal;

import java.util.Comparator;

/**
 * <p>
 * string order by ordianl ignore case
 * </p>
 * 
 * @author fulaihua 2014年12月19日 下午2:29:48
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2014年12月19日
 * @modify by reason:{方法名}:{原因}
 */

 public final class StringOrdinalIgnoreCaseComparator implements Comparator<String>
{

	@Override
	public int compare(String value1, String value2)
	{
		return value1.compareToIgnoreCase(value2);

	}

}

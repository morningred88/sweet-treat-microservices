package com.muhutech.productservice.entity;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "product")
public class Product implements Serializable {
	
	@DynamoDBHashKey(attributeName="prodId")
	@DynamoDBAutoGeneratedKey
	private String prodId;
	
	@DynamoDBAttribute
	private String name;
	
	@DynamoDBAttribute
	private String description;
	
//	@DynamoDBAttribute
//	private int catId;	
//	
//	@DynamoDBAttribute
//	private double price;
//	
//	@DynamoDBAttribute
//	private String imageFilePath;

}

<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Group</name>
   <tag></tag>
   <elementGuidId>7b53fb75-bde0-4cb8-a8a8-3493f7949da4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;groupID\&quot;:\&quot;${groupID}\&quot;,\n  \&quot;groupName\&quot;:\&quot;${groupName}\&quot;,\n  \&quot;contacts\&quot;:[\&quot;abraham_farrendy@ccn.com.sg\&quot;,\&quot;kohcj@ccn.com.sg\&quot;]\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>https://cubedev.ccnexchange.com/cb2ddca64603ec33afeb04a897d6bc08/group</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'5f03fe952ba76300113bebdd'</defaultValue>
      <description></description>
      <id>b779bbc9-3520-4018-adab-a36f6fee849d</id>
      <masked>false</masked>
      <name>groupID</name>
   </variables>
   <variables>
      <defaultValue>'group0001'</defaultValue>
      <description></description>
      <id>3a91a981-bd11-4449-9bf2-4a2316b7a459</id>
      <masked>false</masked>
      <name>groupName</name>
   </variables>
   <variables>
      <defaultValue>[]</defaultValue>
      <description></description>
      <id>362e51a3-1252-439b-af3a-02c832c5e49d</id>
      <masked>false</masked>
      <name>contacts</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Retrieve Group</name>
   <tag></tag>
   <elementGuidId>5fe21798-549f-4cbd-8fd8-adfba486465f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;groupIDs\&quot;: [\n    \&quot;5f117b97cd9705001085d3d2\&quot;\n  ],\n  \&quot;groupNames\&quot;: [\n    \&quot;group4\&quot;\n  ],\n  \&quot;contacts\&quot;: [\n    \&quot;abraham_farrendy@ccn.com.sg\&quot;,\&quot;songmy@ccn.com.sg\&quot;\n  ],\n  \&quot;rules\&quot;: [\n    {\n      \&quot;groupID\&quot;: \&quot;5f117b97cd9705001085d3d2\&quot;,\n      \&quot;contentType\&quot;: \&quot;TEST_ContentType\&quot;,\n      \&quot;tags\&quot;: []\n    }\n  ]\n}&quot;,
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
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://cubedev.ccnexchange.com/cb2ddca64603ec33afeb04a897d6bc08/group</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
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

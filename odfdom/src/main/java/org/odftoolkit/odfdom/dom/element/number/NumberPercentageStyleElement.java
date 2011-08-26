/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberLanguageAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberCountryAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberScriptAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberRfcLanguageTagAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleVolatileAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTransliterationFormatAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTransliterationLanguageAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTransliterationCountryAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTransliterationStyleAttribute;

import org.odftoolkit.odfdom.dom.element.style.StyleTextPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleMapElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element number:percentage-style}.
 *
 */
public class NumberPercentageStyleElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.NUMBER, "percentage-style" );


	/**
	 * Create the instance of <code>NumberPercentageStyleElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public NumberPercentageStyleElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element number:percentage-style}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  NumberPercentageStyleElement}
	 *
     * @param styleNameAttributeValue  The mandatory attribute {@odf.attribute  style:name}"
     *
	 */
	public void init(String styleNameAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNameAttribute</code> , See {@odf.attribute style:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNameAttribute()
	{
		StyleNameAttribute attr = (StyleNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNameAttribute</code> , See {@odf.attribute style:name}
	 *
	 * @param styleNameValue   The type is <code>String</code>
	 */
	public void setStyleNameAttribute( String styleNameValue )
	{
		StyleNameAttribute attr =  new StyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberLanguageAttribute</code> , See {@odf.attribute number:language}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getNumberLanguageAttribute()
	{
		NumberLanguageAttribute attr = (NumberLanguageAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "language" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberLanguageAttribute</code> , See {@odf.attribute number:language}
	 *
	 * @param numberLanguageValue   The type is <code>String</code>
	 */
	public void setNumberLanguageAttribute( String numberLanguageValue )
	{
		NumberLanguageAttribute attr =  new NumberLanguageAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( numberLanguageValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberCountryAttribute</code> , See {@odf.attribute number:country}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getNumberCountryAttribute()
	{
		NumberCountryAttribute attr = (NumberCountryAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "country" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberCountryAttribute</code> , See {@odf.attribute number:country}
	 *
	 * @param numberCountryValue   The type is <code>String</code>
	 */
	public void setNumberCountryAttribute( String numberCountryValue )
	{
		NumberCountryAttribute attr =  new NumberCountryAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( numberCountryValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberScriptAttribute</code> , See {@odf.attribute number:script}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getNumberScriptAttribute()
	{
		NumberScriptAttribute attr = (NumberScriptAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "script" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberScriptAttribute</code> , See {@odf.attribute number:script}
	 *
	 * @param numberScriptValue   The type is <code>String</code>
	 */
	public void setNumberScriptAttribute( String numberScriptValue )
	{
		NumberScriptAttribute attr =  new NumberScriptAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( numberScriptValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberRfcLanguageTagAttribute</code> , See {@odf.attribute number:rfc-language-tag}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getNumberRfcLanguageTagAttribute()
	{
		NumberRfcLanguageTagAttribute attr = (NumberRfcLanguageTagAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "rfc-language-tag" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberRfcLanguageTagAttribute</code> , See {@odf.attribute number:rfc-language-tag}
	 *
	 * @param numberRfcLanguageTagValue   The type is <code>String</code>
	 */
	public void setNumberRfcLanguageTagAttribute( String numberRfcLanguageTagValue )
	{
		NumberRfcLanguageTagAttribute attr =  new NumberRfcLanguageTagAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( numberRfcLanguageTagValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberTitleAttribute</code> , See {@odf.attribute number:title}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getNumberTitleAttribute()
	{
		NumberTitleAttribute attr = (NumberTitleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "title" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberTitleAttribute</code> , See {@odf.attribute number:title}
	 *
	 * @param numberTitleValue   The type is <code>String</code>
	 */
	public void setNumberTitleAttribute( String numberTitleValue )
	{
		NumberTitleAttribute attr =  new NumberTitleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( numberTitleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleVolatileAttribute</code> , See {@odf.attribute style:volatile}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getStyleVolatileAttribute()
	{
		StyleVolatileAttribute attr = (StyleVolatileAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "volatile" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleVolatileAttribute</code> , See {@odf.attribute style:volatile}
	 *
	 * @param styleVolatileValue   The type is <code>Boolean</code>
	 */
	public void setStyleVolatileAttribute( Boolean styleVolatileValue )
	{
		StyleVolatileAttribute attr =  new StyleVolatileAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( styleVolatileValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberTransliterationFormatAttribute</code> , See {@odf.attribute number:transliteration-format}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getNumberTransliterationFormatAttribute()
	{
		NumberTransliterationFormatAttribute attr = (NumberTransliterationFormatAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "transliteration-format" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return NumberTransliterationFormatAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberTransliterationFormatAttribute</code> , See {@odf.attribute number:transliteration-format}
	 *
	 * @param numberTransliterationFormatValue   The type is <code>String</code>
	 */
	public void setNumberTransliterationFormatAttribute( String numberTransliterationFormatValue )
	{
		NumberTransliterationFormatAttribute attr =  new NumberTransliterationFormatAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( numberTransliterationFormatValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberTransliterationLanguageAttribute</code> , See {@odf.attribute number:transliteration-language}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getNumberTransliterationLanguageAttribute()
	{
		NumberTransliterationLanguageAttribute attr = (NumberTransliterationLanguageAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "transliteration-language" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberTransliterationLanguageAttribute</code> , See {@odf.attribute number:transliteration-language}
	 *
	 * @param numberTransliterationLanguageValue   The type is <code>String</code>
	 */
	public void setNumberTransliterationLanguageAttribute( String numberTransliterationLanguageValue )
	{
		NumberTransliterationLanguageAttribute attr =  new NumberTransliterationLanguageAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( numberTransliterationLanguageValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberTransliterationCountryAttribute</code> , See {@odf.attribute number:transliteration-country}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getNumberTransliterationCountryAttribute()
	{
		NumberTransliterationCountryAttribute attr = (NumberTransliterationCountryAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "transliteration-country" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberTransliterationCountryAttribute</code> , See {@odf.attribute number:transliteration-country}
	 *
	 * @param numberTransliterationCountryValue   The type is <code>String</code>
	 */
	public void setNumberTransliterationCountryAttribute( String numberTransliterationCountryValue )
	{
		NumberTransliterationCountryAttribute attr =  new NumberTransliterationCountryAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( numberTransliterationCountryValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberTransliterationStyleAttribute</code> , See {@odf.attribute number:transliteration-style}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getNumberTransliterationStyleAttribute()
	{
		NumberTransliterationStyleAttribute attr = (NumberTransliterationStyleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "transliteration-style" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return NumberTransliterationStyleAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberTransliterationStyleAttribute</code> , See {@odf.attribute number:transliteration-style}
	 *
	 * @param numberTransliterationStyleValue   The type is <code>String</code>
	 */
	public void setNumberTransliterationStyleAttribute( String numberTransliterationStyleValue )
	{
		NumberTransliterationStyleAttribute attr =  new NumberTransliterationStyleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( numberTransliterationStyleValue );
	}

	/**
	 * Create child element {@odf.element style:text-properties}.
	 *
     * @param textDisplayAttributeValue  the <code>String</code> value of <code>TextDisplayAttribute</code>, see {@odf.attribute  text:display} at specification
	 * @return   return  the element {@odf.element style:text-properties}
	 * DifferentQName 
	 */
    
	public StyleTextPropertiesElement newStyleTextPropertiesElement(String textDisplayAttributeValue)
	{
		StyleTextPropertiesElement  styleTextProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
		styleTextProperties.setTextDisplayAttribute( textDisplayAttributeValue );
		this.appendChild( styleTextProperties);
		return  styleTextProperties;      
	}
    
	/**
	 * Create child element {@odf.element style:text-properties}.
	 *
     * @param textConditionAttributeValue  the <code>String</code> value of <code>TextConditionAttribute</code>, see {@odf.attribute  text:condition} at specification
	 * @param textDisplayAttributeValue  the <code>String</code> value of <code>TextDisplayAttribute</code>, see {@odf.attribute  text:display} at specification
	 * @return   return  the element {@odf.element style:text-properties}
	 * DifferentQName 
	 */
    
	public StyleTextPropertiesElement newStyleTextPropertiesElement(String textConditionAttributeValue, String textDisplayAttributeValue)
	{
		StyleTextPropertiesElement  styleTextProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
		styleTextProperties.setTextConditionAttribute( textConditionAttributeValue );
		styleTextProperties.setTextDisplayAttribute( textDisplayAttributeValue );
		this.appendChild( styleTextProperties);
		return  styleTextProperties;      
	}
    
	/**
	 * Create child element {@odf.element number:text}.
	 *
	 * @return   return  the element {@odf.element number:text}
	 * DifferentQName 
	 */
	public NumberTextElement newNumberTextElement()
	{
		NumberTextElement  numberText = ((OdfFileDom)this.ownerDocument).newOdfElement(NumberTextElement.class);
		this.appendChild( numberText);
		return  numberText;
	}                   
               
	/**
	 * Create child element {@odf.element number:number}.
	 *
	 * @return   return  the element {@odf.element number:number}
	 * DifferentQName 
	 */
	public NumberNumberElement newNumberNumberElement()
	{
		NumberNumberElement  numberNumber = ((OdfFileDom)this.ownerDocument).newOdfElement(NumberNumberElement.class);
		this.appendChild( numberNumber);
		return  numberNumber;
	}                   
               
	/**
	 * Create child element {@odf.element style:map}.
	 *
     * @param styleApplyStyleNameAttributeValue  the <code>String</code> value of <code>StyleApplyStyleNameAttribute</code>, see {@odf.attribute  style:apply-style-name} at specification
	 * @param styleConditionAttributeValue  the <code>String</code> value of <code>StyleConditionAttribute</code>, see {@odf.attribute  style:condition} at specification
	 * @return   return  the element {@odf.element style:map}
	 * DifferentQName 
	 */
    
	public StyleMapElement newStyleMapElement(String styleApplyStyleNameAttributeValue, String styleConditionAttributeValue)
	{
		StyleMapElement  styleMap = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleMapElement.class);
		styleMap.setStyleApplyStyleNameAttribute( styleApplyStyleNameAttributeValue );
		styleMap.setStyleConditionAttribute( styleConditionAttributeValue );
		this.appendChild( styleMap);
		return  styleMap;      
	}
    
}

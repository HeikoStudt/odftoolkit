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

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.style.StyleRepeatAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StylePositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleFilterNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawOpacityAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkShowAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkActuateAttribute;

import org.odftoolkit.odfdom.dom.element.office.OfficeBinaryDataElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:background-image}.
 *
 */
public class StyleBackgroundImageElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.STYLE, "background-image" );

	/**
	 * The value set of {@odf.attribute xlink:show}.
	 */
	 public enum XlinkShowAttributeValue {
	 
	 EMBED( XlinkShowAttribute.Value.EMBED.toString() );
              
		private String mValue;
	 	
		XlinkShowAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static XlinkShowAttributeValue enumValueOf( String value )
	    {
	        for( XlinkShowAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	/**
	 * The value set of {@odf.attribute xlink:actuate}.
	 */
	 public enum XlinkActuateAttributeValue {
	 
	 ONLOAD( XlinkActuateAttribute.Value.ONLOAD.toString() );
              
		private String mValue;
	 	
		XlinkActuateAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static XlinkActuateAttributeValue enumValueOf( String value )
	    {
	        for( XlinkActuateAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	public static final String  DEFAULT_VALUE_XLINK_SHOW_ATTRIBUTE = XlinkShowAttribute.Value.EMBED.toString();
	public static final String  DEFAULT_VALUE_XLINK_ACTUATE_ATTRIBUTE = XlinkActuateAttribute.Value.ONLOAD.toString();

	/**
	 * Create the instance of <code>StyleBackgroundImageElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleBackgroundImageElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:background-image}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  StyleBackgroundImageElement}
	 *
     * @param xlinkTypeAttributeValue  The mandatory attribute {@odf.attribute  xlink:type}"
     * @param xlinkHrefAttributeValue  The mandatory attribute {@odf.attribute  xlink:href}"
     *
	 */
	public void init(String xlinkTypeAttributeValue, String xlinkHrefAttributeValue)
	{
		setXlinkTypeAttribute( xlinkTypeAttributeValue );
		setXlinkHrefAttribute( xlinkHrefAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleRepeatAttribute</code> , See {@odf.attribute style:repeat}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleRepeatAttribute()
	{
		StyleRepeatAttribute attr = (StyleRepeatAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "repeat" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return StyleRepeatAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleRepeatAttribute</code> , See {@odf.attribute style:repeat}
	 *
	 * @param styleRepeatValue   The type is <code>String</code>
	 */
	public void setStyleRepeatAttribute( String styleRepeatValue )
	{
		StyleRepeatAttribute attr =  new StyleRepeatAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleRepeatValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StylePositionAttribute</code> , See {@odf.attribute style:position}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStylePositionAttribute()
	{
		StylePositionAttribute attr = (StylePositionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "position" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return StylePositionAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StylePositionAttribute</code> , See {@odf.attribute style:position}
	 *
	 * @param stylePositionValue   The type is <code>String</code>
	 */
	public void setStylePositionAttribute( String stylePositionValue )
	{
		StylePositionAttribute attr =  new StylePositionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( stylePositionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleFilterNameAttribute</code> , See {@odf.attribute style:filter-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleFilterNameAttribute()
	{
		StyleFilterNameAttribute attr = (StyleFilterNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "filter-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleFilterNameAttribute</code> , See {@odf.attribute style:filter-name}
	 *
	 * @param styleFilterNameValue   The type is <code>String</code>
	 */
	public void setStyleFilterNameAttribute( String styleFilterNameValue )
	{
		StyleFilterNameAttribute attr =  new StyleFilterNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleFilterNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawOpacityAttribute</code> , See {@odf.attribute draw:opacity}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawOpacityAttribute()
	{
		DrawOpacityAttribute attr = (DrawOpacityAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "opacity" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawOpacityAttribute</code> , See {@odf.attribute draw:opacity}
	 *
	 * @param drawOpacityValue   The type is <code>String</code>
	 */
	public void setDrawOpacityAttribute( String drawOpacityValue )
	{
		DrawOpacityAttribute attr =  new DrawOpacityAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawOpacityValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkTypeAttribute()
	{
		XlinkTypeAttribute attr = (XlinkTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return XlinkTypeAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @param xlinkTypeValue   The type is <code>String</code>
	 */
	public void setXlinkTypeAttribute( String xlinkTypeValue )
	{
		XlinkTypeAttribute attr =  new XlinkTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkHrefAttribute()
	{
		XlinkHrefAttribute attr = (XlinkHrefAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "href" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @param xlinkHrefValue   The type is <code>String</code>
	 */
	public void setXlinkHrefAttribute( String xlinkHrefValue )
	{
		XlinkHrefAttribute attr =  new XlinkHrefAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkHrefValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkShowAttribute</code> , See {@odf.attribute xlink:show}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkShowAttribute()
	{
		XlinkShowAttribute attr = (XlinkShowAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "show" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return DEFAULT_VALUE_XLINK_SHOW_ATTRIBUTE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkShowAttribute</code> , See {@odf.attribute xlink:show}
	 *
	 * @param xlinkShowValue   The type is <code>String</code>
	 */
	public void setXlinkShowAttribute( String xlinkShowValue )
	{
		XlinkShowAttribute attr =  new XlinkShowAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkShowValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkActuateAttribute()
	{
		XlinkActuateAttribute attr = (XlinkActuateAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "actuate" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return DEFAULT_VALUE_XLINK_ACTUATE_ATTRIBUTE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @param xlinkActuateValue   The type is <code>String</code>
	 */
	public void setXlinkActuateAttribute( String xlinkActuateValue )
	{
		XlinkActuateAttribute attr =  new XlinkActuateAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkActuateValue );
	}

	/**
	 * Create child element {@odf.element office:binary-data}.
	 *
	 * @return   return  the element {@odf.element office:binary-data}
	 * DifferentQName 
	 */
	public OfficeBinaryDataElement newOfficeBinaryDataElement()
	{
		OfficeBinaryDataElement  officeBinaryData = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeBinaryDataElement.class);
		this.appendChild( officeBinaryData);
		return  officeBinaryData;
	}                   
               
}

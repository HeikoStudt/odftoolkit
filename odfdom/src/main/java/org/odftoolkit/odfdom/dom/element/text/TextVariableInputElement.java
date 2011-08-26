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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDescriptionAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDisplayAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDataStyleNameAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:variable-input}.
 *
 */
public class TextVariableInputElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "variable-input" );

	/**
	 * The value set of {@odf.attribute text:display}.
	 */
	 public enum TextDisplayAttributeValue {
	 
	 NONE( TextDisplayAttribute.Value.NONE.toString() ), VALUE( TextDisplayAttribute.Value.VALUE.toString() );
              
		private String mValue;
	 	
		TextDisplayAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static TextDisplayAttributeValue enumValueOf( String value )
	    {
	        for( TextDisplayAttributeValue aIter : values() )
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
	 * Create the instance of <code>TextVariableInputElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextVariableInputElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:variable-input}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextVariableInputElement}
	 *
     * @param textNameAttributeValue  The mandatory attribute {@odf.attribute  text:name}"
     * @param officeValueTypeAttributeValue  The mandatory attribute {@odf.attribute  office:value-type}"
     *
	 */
	public void init(String textNameAttributeValue, String officeValueTypeAttributeValue)
	{
		setTextNameAttribute( textNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextNameAttribute</code> , See {@odf.attribute text:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextNameAttribute()
	{
		TextNameAttribute attr = (TextNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextNameAttribute</code> , See {@odf.attribute text:name}
	 *
	 * @param textNameValue   The type is <code>String</code>
	 */
	public void setTextNameAttribute( String textNameValue )
	{
		TextNameAttribute attr =  new TextNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextDescriptionAttribute</code> , See {@odf.attribute text:description}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextDescriptionAttribute()
	{
		TextDescriptionAttribute attr = (TextDescriptionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "description" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextDescriptionAttribute</code> , See {@odf.attribute text:description}
	 *
	 * @param textDescriptionValue   The type is <code>String</code>
	 */
	public void setTextDescriptionAttribute( String textDescriptionValue )
	{
		TextDescriptionAttribute attr =  new TextDescriptionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textDescriptionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeValueTypeAttribute</code> , See {@odf.attribute office:value-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeValueTypeAttribute()
	{
		OfficeValueTypeAttribute attr = (OfficeValueTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "value-type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeValueTypeAttribute</code> , See {@odf.attribute office:value-type}
	 *
	 * @param officeValueTypeValue   The type is <code>String</code>
	 */
	public void setOfficeValueTypeAttribute( String officeValueTypeValue )
	{
		OfficeValueTypeAttribute attr =  new OfficeValueTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeValueTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextDisplayAttribute</code> , See {@odf.attribute text:display}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextDisplayAttribute()
	{
		TextDisplayAttribute attr = (TextDisplayAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "display" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextDisplayAttribute</code> , See {@odf.attribute text:display}
	 *
	 * @param textDisplayValue   The type is <code>String</code>
	 */
	public void setTextDisplayAttribute( String textDisplayValue )
	{
		TextDisplayAttribute attr =  new TextDisplayAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textDisplayValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleDataStyleNameAttribute()
	{
		StyleDataStyleNameAttribute attr = (StyleDataStyleNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "data-style-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @param styleDataStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleDataStyleNameAttribute( String styleDataStyleNameValue )
	{
		StyleDataStyleNameAttribute attr =  new StyleDataStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleDataStyleNameValue );
	}

}

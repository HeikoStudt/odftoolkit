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
import org.odftoolkit.odfdom.dom.attribute.style.StyleDisplayAttribute;

import org.odftoolkit.odfdom.dom.element.text.TextChangedRegionElement;
import org.odftoolkit.odfdom.dom.element.text.TextVariableDeclElement;
import org.odftoolkit.odfdom.dom.element.text.TextSequenceDeclElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserFieldDeclElement;
import org.odftoolkit.odfdom.dom.element.text.TextDdeConnectionDeclElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexAutoMarkFileElement;
import org.odftoolkit.odfdom.dom.element.text.TextHElement;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.dom.element.text.TextListElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableElement;
import org.odftoolkit.odfdom.dom.element.text.TextSectionElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableOfContentElement;
import org.odftoolkit.odfdom.dom.element.text.TextIllustrationIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextObjectIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextBibliographyElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexTitleElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:header}.
 *
 */
public class StyleHeaderElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.STYLE, "header" );


	/**
	 * Create the instance of <code>StyleHeaderElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleHeaderElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:header}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleDisplayAttribute</code> , See {@odf.attribute style:display}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getStyleDisplayAttribute()
	{
		StyleDisplayAttribute attr = (StyleDisplayAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "display" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( StyleDisplayAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDisplayAttribute</code> , See {@odf.attribute style:display}
	 *
	 * @param styleDisplayValue   The type is <code>Boolean</code>
	 */
	public void setStyleDisplayAttribute( Boolean styleDisplayValue )
	{
		StyleDisplayAttribute attr =  new StyleDisplayAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( styleDisplayValue.booleanValue() );
	}

	/**
	 * Create child element {@odf.element text:changed-region}.
	 *
	 * @return   return  the element {@odf.element text:changed-region}
	 * DifferentQName 
	 */
	public TextChangedRegionElement newTextChangedRegionElement()
	{
		TextChangedRegionElement  textChangedRegion = ((OdfFileDom)this.ownerDocument).newOdfElement(TextChangedRegionElement.class);
		this.appendChild( textChangedRegion);
		return  textChangedRegion;
	}                   
               
	/**
	 * Create child element {@odf.element text:variable-decl}.
	 *
     * @param officeValueTypeAttributeValue  the <code>String</code> value of <code>OfficeValueTypeAttribute</code>, see {@odf.attribute  office:value-type} at specification
	 * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:variable-decl}
	 * DifferentQName 
	 */
    
	public TextVariableDeclElement newTextVariableDeclElement(String officeValueTypeAttributeValue, String textNameAttributeValue)
	{
		TextVariableDeclElement  textVariableDecl = ((OdfFileDom)this.ownerDocument).newOdfElement(TextVariableDeclElement.class);
		textVariableDecl.setOfficeValueTypeAttribute( officeValueTypeAttributeValue );
		textVariableDecl.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textVariableDecl);
		return  textVariableDecl;      
	}
    
	/**
	 * Create child element {@odf.element text:sequence-decl}.
	 *
     * @param textDisplayOutlineLevelAttributeValue  the <code>int</code> value of <code>TextDisplayOutlineLevelAttribute</code>, see {@odf.attribute  text:display-outline-level} at specification
	 * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:sequence-decl}
	 * DifferentQName 
	 */
    
	public TextSequenceDeclElement newTextSequenceDeclElement(int textDisplayOutlineLevelAttributeValue, String textNameAttributeValue)
	{
		TextSequenceDeclElement  textSequenceDecl = ((OdfFileDom)this.ownerDocument).newOdfElement(TextSequenceDeclElement.class);
		textSequenceDecl.setTextDisplayOutlineLevelAttribute( Integer.valueOf(textDisplayOutlineLevelAttributeValue) );
		textSequenceDecl.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textSequenceDecl);
		return  textSequenceDecl;      
	}
    
	/**
	 * Create child element {@odf.element text:user-field-decl}.
	 *
     * @param officeValueAttributeValue  the <code>double</code> value of <code>OfficeValueAttribute</code>, see {@odf.attribute  office:value} at specification
	 * @param officeValueTypeAttributeValue  the <code>String</code> value of <code>OfficeValueTypeAttribute</code>, see {@odf.attribute  office:value-type} at specification
	 * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:user-field-decl}
	 * DifferentQName 
	 */
    
	public TextUserFieldDeclElement newTextUserFieldDeclElement(double officeValueAttributeValue, String officeValueTypeAttributeValue, String textNameAttributeValue)
	{
		TextUserFieldDeclElement  textUserFieldDecl = ((OdfFileDom)this.ownerDocument).newOdfElement(TextUserFieldDeclElement.class);
		textUserFieldDecl.setOfficeValueAttribute( Double.valueOf(officeValueAttributeValue) );
		textUserFieldDecl.setOfficeValueTypeAttribute( officeValueTypeAttributeValue );
		textUserFieldDecl.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textUserFieldDecl);
		return  textUserFieldDecl;      
	}
    
	/**
	 * Create child element {@odf.element text:user-field-decl}.
	 *
     * @param officeDateValueAttributeValue  the <code>String</code> value of <code>OfficeDateValueAttribute</code>, see {@odf.attribute  office:date-value} at specification
	 * @param officeValueTypeAttributeValue  the <code>String</code> value of <code>OfficeValueTypeAttribute</code>, see {@odf.attribute  office:value-type} at specification
	 * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:user-field-decl}
	 * DifferentQName 
	 */
    
	public TextUserFieldDeclElement newTextUserFieldDeclElement(String officeDateValueAttributeValue, String officeValueTypeAttributeValue, String textNameAttributeValue)
	{
		TextUserFieldDeclElement  textUserFieldDecl = ((OdfFileDom)this.ownerDocument).newOdfElement(TextUserFieldDeclElement.class);
		textUserFieldDecl.setOfficeDateValueAttribute( officeDateValueAttributeValue );
		textUserFieldDecl.setOfficeValueTypeAttribute( officeValueTypeAttributeValue );
		textUserFieldDecl.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textUserFieldDecl);
		return  textUserFieldDecl;      
	}
    
	/**
	 * Create child element {@odf.element text:user-field-decl}.
	 *
     * @param officeTimeValueAttributeValue  the <code>String</code> value of <code>OfficeTimeValueAttribute</code>, see {@odf.attribute  office:time-value} at specification
	 * @param officeValueTypeAttributeValue  the <code>String</code> value of <code>OfficeValueTypeAttribute</code>, see {@odf.attribute  office:value-type} at specification
	 * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:user-field-decl}
	 * DifferentQName office:time-value
	 */
    
	public TextUserFieldDeclElement newTextUserFieldDeclElementByTimeValue(String officeTimeValueAttributeValue, String officeValueTypeAttributeValue, String textNameAttributeValue)
	{
		TextUserFieldDeclElement  textUserFieldDecl = ((OdfFileDom)this.ownerDocument).newOdfElement(TextUserFieldDeclElement.class);
		textUserFieldDecl.setOfficeTimeValueAttribute( officeTimeValueAttributeValue );
		textUserFieldDecl.setOfficeValueTypeAttribute( officeValueTypeAttributeValue );
		textUserFieldDecl.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textUserFieldDecl);
		return  textUserFieldDecl;      
	}
    
	/**
	 * Create child element {@odf.element text:user-field-decl}.
	 *
     * @param officeBooleanValueAttributeValue  the <code>boolean</code> value of <code>OfficeBooleanValueAttribute</code>, see {@odf.attribute  office:boolean-value} at specification
	 * @param officeValueTypeAttributeValue  the <code>String</code> value of <code>OfficeValueTypeAttribute</code>, see {@odf.attribute  office:value-type} at specification
	 * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:user-field-decl}
	 * DifferentQName 
	 */
    
	public TextUserFieldDeclElement newTextUserFieldDeclElement(boolean officeBooleanValueAttributeValue, String officeValueTypeAttributeValue, String textNameAttributeValue)
	{
		TextUserFieldDeclElement  textUserFieldDecl = ((OdfFileDom)this.ownerDocument).newOdfElement(TextUserFieldDeclElement.class);
		textUserFieldDecl.setOfficeBooleanValueAttribute( Boolean.valueOf(officeBooleanValueAttributeValue) );
		textUserFieldDecl.setOfficeValueTypeAttribute( officeValueTypeAttributeValue );
		textUserFieldDecl.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textUserFieldDecl);
		return  textUserFieldDecl;      
	}
    
	/**
	 * Create child element {@odf.element text:user-field-decl}.
	 *
     * @param officeValueTypeAttributeValue  the <code>String</code> value of <code>OfficeValueTypeAttribute</code>, see {@odf.attribute  office:value-type} at specification
	 * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:user-field-decl}
	 * DifferentQName 
	 */
    
	public TextUserFieldDeclElement newTextUserFieldDeclElement(String officeValueTypeAttributeValue, String textNameAttributeValue)
	{
		TextUserFieldDeclElement  textUserFieldDecl = ((OdfFileDom)this.ownerDocument).newOdfElement(TextUserFieldDeclElement.class);
		textUserFieldDecl.setOfficeValueTypeAttribute( officeValueTypeAttributeValue );
		textUserFieldDecl.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textUserFieldDecl);
		return  textUserFieldDecl;      
	}
    
	/**
	 * Create child element {@odf.element text:dde-connection-decl}.
	 *
     * @param officeDdeApplicationAttributeValue  the <code>String</code> value of <code>OfficeDdeApplicationAttribute</code>, see {@odf.attribute  office:dde-application} at specification
	 * @param officeDdeItemAttributeValue  the <code>String</code> value of <code>OfficeDdeItemAttribute</code>, see {@odf.attribute  office:dde-item} at specification
	 * @param officeDdeTopicAttributeValue  the <code>String</code> value of <code>OfficeDdeTopicAttribute</code>, see {@odf.attribute  office:dde-topic} at specification
	 * @param officeNameAttributeValue  the <code>String</code> value of <code>OfficeNameAttribute</code>, see {@odf.attribute  office:name} at specification
	 * @return   return  the element {@odf.element text:dde-connection-decl}
	 * DifferentQName 
	 */
    
	public TextDdeConnectionDeclElement newTextDdeConnectionDeclElement(String officeDdeApplicationAttributeValue, String officeDdeItemAttributeValue, String officeDdeTopicAttributeValue, String officeNameAttributeValue)
	{
		TextDdeConnectionDeclElement  textDdeConnectionDecl = ((OdfFileDom)this.ownerDocument).newOdfElement(TextDdeConnectionDeclElement.class);
		textDdeConnectionDecl.setOfficeDdeApplicationAttribute( officeDdeApplicationAttributeValue );
		textDdeConnectionDecl.setOfficeDdeItemAttribute( officeDdeItemAttributeValue );
		textDdeConnectionDecl.setOfficeDdeTopicAttribute( officeDdeTopicAttributeValue );
		textDdeConnectionDecl.setOfficeNameAttribute( officeNameAttributeValue );
		this.appendChild( textDdeConnectionDecl);
		return  textDdeConnectionDecl;      
	}
    
	/**
	 * Create child element {@odf.element text:alphabetical-index-auto-mark-file}.
	 *
     * @param xlinkHrefAttributeValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @param xlinkTypeAttributeValue  the <code>String</code> value of <code>XlinkTypeAttribute</code>, see {@odf.attribute  xlink:type} at specification
	 * @return   return  the element {@odf.element text:alphabetical-index-auto-mark-file}
	 * DifferentQName 
	 */
    
	public TextAlphabeticalIndexAutoMarkFileElement newTextAlphabeticalIndexAutoMarkFileElement(String xlinkHrefAttributeValue, String xlinkTypeAttributeValue)
	{
		TextAlphabeticalIndexAutoMarkFileElement  textAlphabeticalIndexAutoMarkFile = ((OdfFileDom)this.ownerDocument).newOdfElement(TextAlphabeticalIndexAutoMarkFileElement.class);
		textAlphabeticalIndexAutoMarkFile.setXlinkHrefAttribute( xlinkHrefAttributeValue );
		textAlphabeticalIndexAutoMarkFile.setXlinkTypeAttribute( xlinkTypeAttributeValue );
		this.appendChild( textAlphabeticalIndexAutoMarkFile);
		return  textAlphabeticalIndexAutoMarkFile;      
	}
    
	/**
	 * Create child element {@odf.element text:h}.
	 *
     * @param textOutlineLevelAttributeValue  the <code>String</code> value of <code>TextOutlineLevelAttribute</code>, see {@odf.attribute  text:outline-level} at specification
	 * @return   return  the element {@odf.element text:h}
	 * DifferentQName 
	 */
    
	public TextHElement newTextHElement(String textOutlineLevelAttributeValue)
	{
		TextHElement  textH = ((OdfFileDom)this.ownerDocument).newOdfElement(TextHElement.class);
		textH.setTextOutlineLevelAttribute( textOutlineLevelAttributeValue );
		this.appendChild( textH);
		return  textH;      
	}
    
	/**
	 * Create child element {@odf.element text:p}.
	 *
	 * @return   return  the element {@odf.element text:p}
	 * DifferentQName 
	 */
	public TextPElement newTextPElement()
	{
		TextPElement  textP = ((OdfFileDom)this.ownerDocument).newOdfElement(TextPElement.class);
		this.appendChild( textP);
		return  textP;
	}                   
               
	/**
	 * Create child element {@odf.element text:list}.
	 *
	 * @return   return  the element {@odf.element text:list}
	 * DifferentQName 
	 */
	public TextListElement newTextListElement()
	{
		TextListElement  textList = ((OdfFileDom)this.ownerDocument).newOdfElement(TextListElement.class);
		this.appendChild( textList);
		return  textList;
	}                   
               
	/**
	 * Create child element {@odf.element table:table}.
	 *
	 * @return   return  the element {@odf.element table:table}
	 * DifferentQName 
	 */
	public TableTableElement newTableTableElement()
	{
		TableTableElement  tableTable = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableElement.class);
		this.appendChild( tableTable);
		return  tableTable;
	}                   
               
	/**
	 * Create child element {@odf.element text:section}.
	 *
     * @param textDisplayAttributeValue  the <code>String</code> value of <code>TextDisplayAttribute</code>, see {@odf.attribute  text:display} at specification
	 * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:section}
	 * DifferentQName 
	 */
    
	public TextSectionElement newTextSectionElement(String textDisplayAttributeValue, String textNameAttributeValue)
	{
		TextSectionElement  textSection = ((OdfFileDom)this.ownerDocument).newOdfElement(TextSectionElement.class);
		textSection.setTextDisplayAttribute( textDisplayAttributeValue );
		textSection.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textSection);
		return  textSection;      
	}
    
	/**
	 * Create child element {@odf.element text:section}.
	 *
     * @param textConditionAttributeValue  the <code>String</code> value of <code>TextConditionAttribute</code>, see {@odf.attribute  text:condition} at specification
	 * @param textDisplayAttributeValue  the <code>String</code> value of <code>TextDisplayAttribute</code>, see {@odf.attribute  text:display} at specification
	 * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:section}
	 * DifferentQName 
	 */
    
	public TextSectionElement newTextSectionElement(String textConditionAttributeValue, String textDisplayAttributeValue, String textNameAttributeValue)
	{
		TextSectionElement  textSection = ((OdfFileDom)this.ownerDocument).newOdfElement(TextSectionElement.class);
		textSection.setTextConditionAttribute( textConditionAttributeValue );
		textSection.setTextDisplayAttribute( textDisplayAttributeValue );
		textSection.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textSection);
		return  textSection;      
	}
    
	/**
	 * Create child element {@odf.element text:table-of-content}.
	 *
     * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:table-of-content}
	 * DifferentQName 
	 */
    
	public TextTableOfContentElement newTextTableOfContentElement(String textNameAttributeValue)
	{
		TextTableOfContentElement  textTableOfContent = ((OdfFileDom)this.ownerDocument).newOdfElement(TextTableOfContentElement.class);
		textTableOfContent.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textTableOfContent);
		return  textTableOfContent;      
	}
    
	/**
	 * Create child element {@odf.element text:illustration-index}.
	 *
     * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:illustration-index}
	 * DifferentQName 
	 */
    
	public TextIllustrationIndexElement newTextIllustrationIndexElement(String textNameAttributeValue)
	{
		TextIllustrationIndexElement  textIllustrationIndex = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIllustrationIndexElement.class);
		textIllustrationIndex.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textIllustrationIndex);
		return  textIllustrationIndex;      
	}
    
	/**
	 * Create child element {@odf.element text:table-index}.
	 *
     * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:table-index}
	 * DifferentQName 
	 */
    
	public TextTableIndexElement newTextTableIndexElement(String textNameAttributeValue)
	{
		TextTableIndexElement  textTableIndex = ((OdfFileDom)this.ownerDocument).newOdfElement(TextTableIndexElement.class);
		textTableIndex.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textTableIndex);
		return  textTableIndex;      
	}
    
	/**
	 * Create child element {@odf.element text:object-index}.
	 *
     * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:object-index}
	 * DifferentQName 
	 */
    
	public TextObjectIndexElement newTextObjectIndexElement(String textNameAttributeValue)
	{
		TextObjectIndexElement  textObjectIndex = ((OdfFileDom)this.ownerDocument).newOdfElement(TextObjectIndexElement.class);
		textObjectIndex.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textObjectIndex);
		return  textObjectIndex;      
	}
    
	/**
	 * Create child element {@odf.element text:user-index}.
	 *
     * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:user-index}
	 * DifferentQName 
	 */
    
	public TextUserIndexElement newTextUserIndexElement(String textNameAttributeValue)
	{
		TextUserIndexElement  textUserIndex = ((OdfFileDom)this.ownerDocument).newOdfElement(TextUserIndexElement.class);
		textUserIndex.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textUserIndex);
		return  textUserIndex;      
	}
    
	/**
	 * Create child element {@odf.element text:alphabetical-index}.
	 *
     * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:alphabetical-index}
	 * DifferentQName 
	 */
    
	public TextAlphabeticalIndexElement newTextAlphabeticalIndexElement(String textNameAttributeValue)
	{
		TextAlphabeticalIndexElement  textAlphabeticalIndex = ((OdfFileDom)this.ownerDocument).newOdfElement(TextAlphabeticalIndexElement.class);
		textAlphabeticalIndex.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textAlphabeticalIndex);
		return  textAlphabeticalIndex;      
	}
    
	/**
	 * Create child element {@odf.element text:bibliography}.
	 *
     * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:bibliography}
	 * DifferentQName 
	 */
    
	public TextBibliographyElement newTextBibliographyElement(String textNameAttributeValue)
	{
		TextBibliographyElement  textBibliography = ((OdfFileDom)this.ownerDocument).newOdfElement(TextBibliographyElement.class);
		textBibliography.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textBibliography);
		return  textBibliography;      
	}
    
	/**
	 * Create child element {@odf.element text:index-title}.
	 *
     * @param textNameAttributeValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return   return  the element {@odf.element text:index-title}
	 * DifferentQName 
	 */
    
	public TextIndexTitleElement newTextIndexTitleElement(String textNameAttributeValue)
	{
		TextIndexTitleElement  textIndexTitle = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIndexTitleElement.class);
		textIndexTitle.setTextNameAttribute( textNameAttributeValue );
		this.appendChild( textIndexTitle);
		return  textIndexTitle;      
	}
    
	/**
	 * Create child element {@odf.element style:region-left}.
	 *
	 * @return   return  the element {@odf.element style:region-left}
	 * DifferentQName 
	 */
	public StyleRegionLeftElement newStyleRegionLeftElement()
	{
		StyleRegionLeftElement  styleRegionLeft = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleRegionLeftElement.class);
		this.appendChild( styleRegionLeft);
		return  styleRegionLeft;
	}                   
               
	/**
	 * Create child element {@odf.element style:region-center}.
	 *
	 * @return   return  the element {@odf.element style:region-center}
	 * DifferentQName 
	 */
	public StyleRegionCenterElement newStyleRegionCenterElement()
	{
		StyleRegionCenterElement  styleRegionCenter = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleRegionCenterElement.class);
		this.appendChild( styleRegionCenter);
		return  styleRegionCenter;
	}                   
               
	/**
	 * Create child element {@odf.element style:region-right}.
	 *
	 * @return   return  the element {@odf.element style:region-right}
	 * DifferentQName 
	 */
	public StyleRegionRightElement newStyleRegionRightElement()
	{
		StyleRegionRightElement  styleRegionRight = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleRegionRightElement.class);
		this.appendChild( styleRegionRight);
		return  styleRegionRight;
	}                   
               
}

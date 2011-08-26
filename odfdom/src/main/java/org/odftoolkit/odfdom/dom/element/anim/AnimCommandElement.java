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

package org.odftoolkit.odfdom.dom.element.anim;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationNodeTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPresetIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPresetSubTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPresetClassAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationMasterElementAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationGroupIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.anim.AnimIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.anim.AnimCommandAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilBeginAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilEndAttribute;
import org.odftoolkit.odfdom.dom.attribute.smil.SmilTargetElementAttribute;
import org.odftoolkit.odfdom.dom.attribute.anim.AnimSubItemAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element anim:command}.
 *
 */
public class AnimCommandElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.ANIM, "command" );


	/**
	 * Create the instance of <code>AnimCommandElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public AnimCommandElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element anim:command}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  AnimCommandElement}
	 *
     * @param animCommandAttributeValue  The mandatory attribute {@odf.attribute  anim:command}"
     *
	 */
	public void init(String animCommandAttributeValue)
	{
		setAnimCommandAttribute( animCommandAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationNodeTypeAttribute</code> , See {@odf.attribute presentation:node-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationNodeTypeAttribute()
	{
		PresentationNodeTypeAttribute attr = (PresentationNodeTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "node-type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return PresentationNodeTypeAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationNodeTypeAttribute</code> , See {@odf.attribute presentation:node-type}
	 *
	 * @param presentationNodeTypeValue   The type is <code>String</code>
	 */
	public void setPresentationNodeTypeAttribute( String presentationNodeTypeValue )
	{
		PresentationNodeTypeAttribute attr =  new PresentationNodeTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationNodeTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPresetIdAttribute</code> , See {@odf.attribute presentation:preset-id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationPresetIdAttribute()
	{
		PresentationPresetIdAttribute attr = (PresentationPresetIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "preset-id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPresetIdAttribute</code> , See {@odf.attribute presentation:preset-id}
	 *
	 * @param presentationPresetIdValue   The type is <code>String</code>
	 */
	public void setPresentationPresetIdAttribute( String presentationPresetIdValue )
	{
		PresentationPresetIdAttribute attr =  new PresentationPresetIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationPresetIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPresetSubTypeAttribute</code> , See {@odf.attribute presentation:preset-sub-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationPresetSubTypeAttribute()
	{
		PresentationPresetSubTypeAttribute attr = (PresentationPresetSubTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "preset-sub-type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPresetSubTypeAttribute</code> , See {@odf.attribute presentation:preset-sub-type}
	 *
	 * @param presentationPresetSubTypeValue   The type is <code>String</code>
	 */
	public void setPresentationPresetSubTypeAttribute( String presentationPresetSubTypeValue )
	{
		PresentationPresetSubTypeAttribute attr =  new PresentationPresetSubTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationPresetSubTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationPresetClassAttribute</code> , See {@odf.attribute presentation:preset-class}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationPresetClassAttribute()
	{
		PresentationPresetClassAttribute attr = (PresentationPresetClassAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "preset-class" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return PresentationPresetClassAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationPresetClassAttribute</code> , See {@odf.attribute presentation:preset-class}
	 *
	 * @param presentationPresetClassValue   The type is <code>String</code>
	 */
	public void setPresentationPresetClassAttribute( String presentationPresetClassValue )
	{
		PresentationPresetClassAttribute attr =  new PresentationPresetClassAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationPresetClassValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationMasterElementAttribute</code> , See {@odf.attribute presentation:master-element}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationMasterElementAttribute()
	{
		PresentationMasterElementAttribute attr = (PresentationMasterElementAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "master-element" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationMasterElementAttribute</code> , See {@odf.attribute presentation:master-element}
	 *
	 * @param presentationMasterElementValue   The type is <code>String</code>
	 */
	public void setPresentationMasterElementAttribute( String presentationMasterElementValue )
	{
		PresentationMasterElementAttribute attr =  new PresentationMasterElementAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationMasterElementValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationGroupIdAttribute</code> , See {@odf.attribute presentation:group-id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationGroupIdAttribute()
	{
		PresentationGroupIdAttribute attr = (PresentationGroupIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.PRESENTATION), "group-id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationGroupIdAttribute</code> , See {@odf.attribute presentation:group-id}
	 *
	 * @param presentationGroupIdValue   The type is <code>String</code>
	 */
	public void setPresentationGroupIdAttribute( String presentationGroupIdValue )
	{
		PresentationGroupIdAttribute attr =  new PresentationGroupIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( presentationGroupIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>AnimIdAttribute</code> , See {@odf.attribute anim:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getAnimIdAttribute()
	{
		AnimIdAttribute attr = (AnimIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.ANIM), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>AnimIdAttribute</code> , See {@odf.attribute anim:id}
	 *
	 * @param animIdValue   The type is <code>String</code>
	 */
	public void setAnimIdAttribute( String animIdValue )
	{
		AnimIdAttribute attr =  new AnimIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( animIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute()
	{
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XML), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute( String xmlIdValue )
	{
		XmlIdAttribute attr =  new XmlIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xmlIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>AnimCommandAttribute</code> , See {@odf.attribute anim:command}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getAnimCommandAttribute()
	{
		AnimCommandAttribute attr = (AnimCommandAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.ANIM), "command" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>AnimCommandAttribute</code> , See {@odf.attribute anim:command}
	 *
	 * @param animCommandValue   The type is <code>String</code>
	 */
	public void setAnimCommandAttribute( String animCommandValue )
	{
		AnimCommandAttribute attr =  new AnimCommandAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( animCommandValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilBeginAttribute</code> , See {@odf.attribute smil:begin}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilBeginAttribute()
	{
		SmilBeginAttribute attr = (SmilBeginAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "begin" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilBeginAttribute</code> , See {@odf.attribute smil:begin}
	 *
	 * @param smilBeginValue   The type is <code>String</code>
	 */
	public void setSmilBeginAttribute( String smilBeginValue )
	{
		SmilBeginAttribute attr =  new SmilBeginAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilBeginValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilEndAttribute</code> , See {@odf.attribute smil:end}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilEndAttribute()
	{
		SmilEndAttribute attr = (SmilEndAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "end" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilEndAttribute</code> , See {@odf.attribute smil:end}
	 *
	 * @param smilEndValue   The type is <code>String</code>
	 */
	public void setSmilEndAttribute( String smilEndValue )
	{
		SmilEndAttribute attr =  new SmilEndAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilEndValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SmilTargetElementAttribute</code> , See {@odf.attribute smil:targetElement}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSmilTargetElementAttribute()
	{
		SmilTargetElementAttribute attr = (SmilTargetElementAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SMIL), "targetElement" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SmilTargetElementAttribute</code> , See {@odf.attribute smil:targetElement}
	 *
	 * @param smilTargetElementValue   The type is <code>String</code>
	 */
	public void setSmilTargetElementAttribute( String smilTargetElementValue )
	{
		SmilTargetElementAttribute attr =  new SmilTargetElementAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( smilTargetElementValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>AnimSubItemAttribute</code> , See {@odf.attribute anim:sub-item}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getAnimSubItemAttribute()
	{
		AnimSubItemAttribute attr = (AnimSubItemAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.ANIM), "sub-item" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>AnimSubItemAttribute</code> , See {@odf.attribute anim:sub-item}
	 *
	 * @param animSubItemValue   The type is <code>String</code>
	 */
	public void setAnimSubItemAttribute( String animSubItemValue )
	{
		AnimSubItemAttribute attr =  new AnimSubItemAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( animSubItemValue );
	}

}

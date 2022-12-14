/****************************************************************************
 * ubion.ORS - The Open Report Suite                                        *
 *                                                                          *
 * ------------------------------------------------------------------------ *
 *                                                                          *
 * Subproject: NOA (Nice Office Access)                                     *
 *                                                                          *
 *                                                                          *
 * The Contents of this file are made available subject to                  *
 * the terms of GNU Lesser General Public License Version 2.1.              *
 *                                                                          * 
 * GNU Lesser General Public License Version 2.1                            *
 * ======================================================================== *
 * Copyright 2003-2005 by IOn AG                                            *
 *                                                                          *
 * This library is free software; you can redistribute it and/or            *
 * modify it under the terms of the GNU Lesser General Public               *
 * License version 2.1, as published by the Free Software Foundation.       *
 *                                                                          *
 * This library is distributed in the hope that it will be useful,          *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of           *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU        *
 * Lesser General Public License for more details.                          *
 *                                                                          *
 * You should have received a copy of the GNU Lesser General Public         *
 * License along with this library; if not, write to the Free Software      *
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston,                    *
 * MA  02111-1307  USA                                                      *
 *                                                                          *
 * Contact us:                                                              *
 *  http://www.ion.ag                                                       *
 *  info@ion.ag                                                             *
 *                                                                          *
 ****************************************************************************/
 
/*
 * Last changes made by $Author: andreas $, $Date: 2006-10-04 14:14:28 +0200 (Mi, 04 Okt 2006) $
 */
package ag.ion.bion.officelayer.internal.beans;

import ag.ion.bion.officelayer.beans.IPropertyKey;

/**
 * A key for a property.
 * 
 * @author Markus Kr??ger
 * @version $Revision: 10398 $
 */
public class PropertyKey implements IPropertyKey {
  
	private String key = null;
  private String text = null;
  private String description = null;
  
  //----------------------------------------------------------------------------
  /**
   * Constructs new PropertyKey.
   * 
   * @param key key to be used
   * @param text text to be used
   * @param description description to be used
   * 
   * @throws IllegalArgumentException if the key is not valid
   * 
   * @author Markus Kr??ger
   */
  public PropertyKey(String key, String text, String description) throws IllegalArgumentException {
    if(key == null)
      throw new IllegalArgumentException("Submitted key is not valid.");
    this.key = key;
    this.text = text;
    this.description = description;
  }
  //----------------------------------------------------------------------------
  /**
   * Returns the key used with open office.
   * 
   * @return the key used with open office
   * 
   * @author Markus Kr??ger
   */
  public String getKey() {
    return key;
  }
  //----------------------------------------------------------------------------
  /**
   * Returns the text used for this key.
   * 
   * @return the text used for this key
   * 
   * @author Markus Kr??ger
   */
  public String getText() {
    if(text == null)
      return key;
    return text;
  }
  //----------------------------------------------------------------------------
  /**
   * Returns the description used for this key.
   * 
   * @return the description used for this key
   * 
   * @author Markus Kr??ger
   */
  public String getDescription() {
    if(description == null) {
      if(text == null)
        return key;
      else
        return text;
    }
    return description;
  }
  //----------------------------------------------------------------------------
}

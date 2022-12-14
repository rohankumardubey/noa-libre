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
package ag.ion.bion.officelayer.desktop;

/**
 * Covers all OpenOffice.org desktop exceptions.
 * 
 * @author Andreas Br??ker
 * @version $Revision: 10398 $
 */
public class DesktopException extends Exception {
  
  private static final String DEFAULT_EXCEPTION_MESSAGE = "No message available.";
  
  //----------------------------------------------------------------------------
  /**
   * Constructs new DesktopException.
   * 
   * @author Andreas Br??ker
   */
  public DesktopException() {
    super();
  }
  //----------------------------------------------------------------------------
  /**
   * Constructs new DesktopException with the submitted message.
   * 
   * @param message message to be used
   * 
   * @author Andreas Br??ker 
   */
  public DesktopException(String message) {
    super(message == null ? DEFAULT_EXCEPTION_MESSAGE : message);
  }
  //----------------------------------------------------------------------------
  /**
   * Constructs new DesktopException with the submitted exception.
   * 
   * @param exception exception to be used
   * 
   * @author Markus Kr??ger
   */
  public DesktopException(Exception exception) {
    super(exception.getMessage() == null ? DEFAULT_EXCEPTION_MESSAGE : exception.getMessage());
    initCause(exception);
  }
  //----------------------------------------------------------------------------
  /**
   * Constructs new DesktopException with the submitted exception and a message.
   * 
   * @param message message to be used
   * @param exception exception to be used
   * 
   * @author Markus Kr??ger
   */
  public DesktopException(String message, Exception exception) {
    super(message == null ? DEFAULT_EXCEPTION_MESSAGE : message);
    initCause(exception);
  }
  //----------------------------------------------------------------------------

}
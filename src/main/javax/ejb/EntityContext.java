/*
* JBoss, Home of Professional Open Source
* Copyright 2010, JBoss Inc., and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
*
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/
package javax.ejb;

/**
 * <P>The EntityContext interface provides an instance with access to
 * the container-provided runtime context of an entity enterprise Bean
 * instance. The container passes the EntityContext interface to an entity
 * enterprise Bean instance after the instance has been created.</P>
 * 
 * <P>The EntityContext interface remains associated with the instance for the
 * lifetime of the instance. Note that the information that the instance
 * obtains using the EntityContext interface (such as the result of the
 * getPrimaryKey() method) may change, as the container assigns the instance
 * to different EJB objects during the instance's life cycle.</P>
 */
public interface EntityContext extends EJBContext {

  /**
   * <P>Obtain a reference to the EJB local object that is currently associated with the instance.</P>
   *
   * <P>An instance of an entity enterprise Bean can call this method only when the instance is associated
   * with an EJB local object identity, i.e. in the ejbActivate, ejbPassivate, ejbPostCreate, ejbRemove, ejbLoad,
   * ejbStore, and business methods.</P>
   *
   * <P>An instance can use this method, for example, when it wants to pass a reference to itself in a
   * method argument or result.</P>
   *
   * @return The EJB local object currently associated with the instance.
   * @exception java.lang.IllegalStateException - if the instance invokes this method while the instance
   * is in a state that does not allow the instance to invoke this method, or if the instance does not have
   * a local interface.
   */
  public EJBLocalObject getEJBLocalObject() throws IllegalStateException;

  /**
   * <P>Obtain a reference to the EJB object that is currently associated with the instance.</P>
   *
   * <P>An instance of an entity enterprise Bean can call this method only when the instance is associated
   * with an EJB object identity, i.e. in the ejbActivate, ejbPassivate, ejbPostCreate, ejbRemove, ejbLoad,
   * ejbStore, and business methods.</P>
   *
   * <P>An instance can use this method, for example, when it wants to pass a reference to itself in a method
   * argument or result.</P>
   *
   * @return The EJB object currently associated with the instance.
   * @exception java.lang.IllegalStateException - Thrown if the instance invokes this method while the instance
   * is in a state that does not allow the instance to invoke this method, or if the instance does not have a
   * remote interface.
   */
  public EJBObject getEJBObject() throws IllegalStateException;

  /**
   * <P>Obtain the primary key of the EJB object that is currently associated with this instance.</P>
   *
   * <P>An instance of an entity enterprise Bean can call this method only when the instance is associated
   * with an EJB object identity, i.e. in the ejbActivate, ejbPassivate, ejbPostCreate, ejbRemove, ejbLoad,
   * ejbStore, and business methods.</P>
   *
   * <P><B>Note:</B> The result of this method is that same as the result of getEJBObject().getPrimaryKey().</P>
   *
   * @return The primary key currently associated with the instance.
   * @exception java.lang.IllegalStateException - Thrown if the instance invokes this method while the
   * instance is in a state that does not allow the instance to invoke this method.
   */
  public Object getPrimaryKey() throws IllegalStateException;
}

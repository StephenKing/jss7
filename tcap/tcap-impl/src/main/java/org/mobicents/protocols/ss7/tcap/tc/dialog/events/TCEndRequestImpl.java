/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
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

/**
 * 
 */
package org.mobicents.protocols.ss7.tcap.tc.dialog.events;

import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.EventType;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCEndRequest;
import org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TerminationType;
import org.mobicents.protocols.ss7.tcap.asn.ApplicationContextName;
import org.mobicents.protocols.ss7.tcap.asn.UserInformation;

/**
 * @author baranowb
 * @author sergey vetyutnev
 * 
 */
public class TCEndRequestImpl extends DialogRequestImpl implements TCEndRequest {

	private boolean returnMessageOnError;
	private TerminationType terminationType;

	// fields
	private ApplicationContextName applicationContextName;
	private UserInformation userInformation;

	TCEndRequestImpl() {
		super(EventType.End);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCBeginRequest#
	 * getApplicationContextName()
	 */
	public ApplicationContextName getApplicationContextName() {
		return applicationContextName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCBeginRequest#
	 * getUserInformation()
	 */
	public UserInformation getUserInformation() {

		return this.userInformation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCBeginRequest#
	 * setApplicationContextName
	 * (org.mobicents.protocols.ss7.tcap.asn.ApplicationContextName)
	 */
	public void setApplicationContextName(ApplicationContextName acn) {
		this.applicationContextName = acn;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.tcap.api.tc.dialog.events.TCBeginRequest#
	 * setUserInformation(org.mobicents.protocols.ss7.tcap.asn.UserInformation)
	 */
	public void setUserInformation(UserInformation acn) {
		this.userInformation = acn;

	}

	public TerminationType getTerminationType() {

		return this.terminationType;
	}

	public void setTermination(TerminationType t) {
		this.terminationType = t;

	}

	@Override
	public void setReturnMessageOnError(boolean val) {
		returnMessageOnError = val;
	}

	@Override
	public boolean getReturnMessageOnError() {
		return returnMessageOnError;
	}

}

package org.iet.sample.plugin.demo.webservice;

import com.reallysi.rsuite.api.*;
import com.reallysi.rsuite.api.remoteapi.*;
import com.reallysi.rsuite.api.remoteapi.result.MessageDialogResult;
import com.reallysi.rsuite.service.ManagedObjectService;

public class SampleWebService extends DefaultRemoteApiHandler {

	@Override
	public RemoteApiResult execute(RemoteApiExecutionContext context, CallArgumentList args) throws RSuiteException {
		
		String moId = args.getFirstString("mo_id");
		
		ManagedObjectService managedObjectService = context.getManagedObjectService();
		ManagedObject managedObject = managedObjectService.getManagedObject(getUser(context), moId);
		
		if (managedObject == null){
			return new MessageDialogResult("Info", String.format("MO with id %s does not exist", moId));
		}
		
		return new MessageDialogResult("Info", managedObject.getDisplayName());
	}

	private User getUser(RemoteApiExecutionContext context) {
		return context.getSession().getUser();
	}

}

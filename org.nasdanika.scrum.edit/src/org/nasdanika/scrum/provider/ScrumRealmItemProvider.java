/**
 */
package org.nasdanika.scrum.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.cdo.security.SecurityPackage;

import org.nasdanika.cdo.security.provider.LoginPasswordRealmItemProvider;
import org.nasdanika.scrum.ScrumFactory;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.ScrumRealm;

/**
 * This is the item provider adapter for a {@link org.nasdanika.scrum.ScrumRealm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScrumRealmItemProvider extends LoginPasswordRealmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrumRealmItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_name_feature", "_UI_ModelElement_type"),
				 ScrumPackage.Literals.MODEL_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_description_feature", "_UI_ModelElement_type"),
				 ScrumPackage.Literals.MODEL_ELEMENT__DESCRIPTION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ScrumPackage.Literals.MODEL_ELEMENT__NOTES);
			childrenFeatures.add(ScrumPackage.Literals.SCRUM_REALM__PARTIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ScrumRealm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScrumRealm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScrumRealm)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ScrumRealm_type") :
			getString("_UI_ScrumRealm_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ScrumRealm.class)) {
			case ScrumPackage.SCRUM_REALM__NAME:
			case ScrumPackage.SCRUM_REALM__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScrumPackage.SCRUM_REALM__NOTES:
			case ScrumPackage.SCRUM_REALM__PARTIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.MODEL_ELEMENT__NOTES,
				 ScrumFactory.eINSTANCE.createNote()));

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.SCRUM_REALM__PARTIES,
				 ScrumFactory.eINSTANCE.createPartyCategory()));

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.SCRUM_REALM__PARTIES,
				 ScrumFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.SCRUM_REALM__PARTIES,
				 ScrumFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.SCRUM_REALM__PARTIES,
				 ScrumFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.SCRUM_REALM__PARTIES,
				 ScrumFactory.eINSTANCE.createPartyReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.SCRUM_REALM__PARTIES,
				 ScrumFactory.eINSTANCE.createScrumTeam()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SecurityPackage.Literals.REALM__GUEST ||
			childFeature == SecurityPackage.Literals.REALM__EVERYONE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return nasdanikascrumEditPlugin.INSTANCE;
	}

	
}

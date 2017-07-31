/**
 */
package org.nasdanika.scrum.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.scrum.ScrumFactory;
import org.nasdanika.scrum.ScrumPackage;
import org.nasdanika.scrum.ScrumTeam;

/**
 * This is the item provider adapter for a {@link org.nasdanika.scrum.ScrumTeam} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScrumTeamItemProvider extends OrganizationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrumTeamItemProvider(AdapterFactory adapterFactory) {
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

			addProductOwnerPropertyDescriptor(object);
			addScrumMasterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Product Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrumTeam_productOwner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrumTeam_productOwner_feature", "_UI_ScrumTeam_type"),
				 ScrumPackage.Literals.SCRUM_TEAM__PRODUCT_OWNER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scrum Master feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScrumMasterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScrumTeam_scrumMaster_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScrumTeam_scrumMaster_feature", "_UI_ScrumTeam_type"),
				 ScrumPackage.Literals.SCRUM_TEAM__SCRUM_MASTER,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ScrumPackage.Literals.SCRUM_TEAM__DEVELOPMENTTEAMS);
			childrenFeatures.add(ScrumPackage.Literals.SCRUM_TEAM__PRODUCTS);
			childrenFeatures.add(ScrumPackage.Literals.SCRUM_TEAM__INTERACTIONS);
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
	 * This returns ScrumTeam.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScrumTeam"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScrumTeam)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ScrumTeam_type") :
			getString("_UI_ScrumTeam_type") + " " + label;
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

		switch (notification.getFeatureID(ScrumTeam.class)) {
			case ScrumPackage.SCRUM_TEAM__DEVELOPMENTTEAMS:
			case ScrumPackage.SCRUM_TEAM__PRODUCTS:
			case ScrumPackage.SCRUM_TEAM__INTERACTIONS:
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
				(ScrumPackage.Literals.SCRUM_TEAM__DEVELOPMENTTEAMS,
				 ScrumFactory.eINSTANCE.createDevelopmentTeam()));

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.SCRUM_TEAM__PRODUCTS,
				 ScrumFactory.eINSTANCE.createAbstractProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.SCRUM_TEAM__PRODUCTS,
				 ScrumFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.SCRUM_TEAM__PRODUCTS,
				 ScrumFactory.eINSTANCE.createProductCategory()));

		newChildDescriptors.add
			(createChildParameter
				(ScrumPackage.Literals.SCRUM_TEAM__INTERACTIONS,
				 ScrumFactory.eINSTANCE.createInteraction()));
	}

}

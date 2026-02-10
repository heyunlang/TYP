/**
 */
package com.example.gsn.gsn.provider;


import com.example.gsn.gsn.GsnFactory;
import com.example.gsn.gsn.GsnPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.example.gsn.gsn.Module} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleItemProvider(AdapterFactory adapterFactory) {
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

			addIsPublicPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Public feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPublicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Module_isPublic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Module_isPublic_feature", "_UI_Module_type"),
				 GsnPackage.Literals.MODULE__IS_PUBLIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(GsnPackage.Literals.MODULE__RELATIONSHIPS);
			childrenFeatures.add(GsnPackage.Literals.MODULE__ELEMENTS);
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
	 * This returns Module.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Module"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		com.example.gsn.gsn.Module module = (com.example.gsn.gsn.Module)object;
		return getString("_UI_Module_type") + " " + module.isIsPublic();
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

		switch (notification.getFeatureID(com.example.gsn.gsn.Module.class)) {
			case GsnPackage.MODULE__IS_PUBLIC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GsnPackage.MODULE__RELATIONSHIPS:
			case GsnPackage.MODULE__ELEMENTS:
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
				(GsnPackage.Literals.MODULE__RELATIONSHIPS,
				 GsnFactory.eINSTANCE.createInContextOf()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.MODULE__RELATIONSHIPS,
				 GsnFactory.eINSTANCE.createSupportedBy()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.MODULE__ELEMENTS,
				 GsnFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.MODULE__ELEMENTS,
				 GsnFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.MODULE__ELEMENTS,
				 GsnFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.MODULE__ELEMENTS,
				 GsnFactory.eINSTANCE.createJustification()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.MODULE__ELEMENTS,
				 GsnFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.MODULE__ELEMENTS,
				 GsnFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.MODULE__ELEMENTS,
				 GsnFactory.eINSTANCE.createAwaySolution()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.MODULE__ELEMENTS,
				 GsnFactory.eINSTANCE.createAwayGoal()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.MODULE__ELEMENTS,
				 GsnFactory.eINSTANCE.createAwayContext()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GsnEditPlugin.INSTANCE;
	}

}

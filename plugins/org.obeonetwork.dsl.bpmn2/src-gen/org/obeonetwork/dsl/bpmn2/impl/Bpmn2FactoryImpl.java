/**
 * <copyright>
 * 
 * Copyright (c) 2011-2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Obeo - initial API and implementation
 * 
 * </copyright>
 */
package org.obeonetwork.dsl.bpmn2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.obeonetwork.dsl.bpmn2.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class Bpmn2FactoryImpl extends EFactoryImpl implements Bpmn2Factory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static Bpmn2Factory init() {
		try {
			Bpmn2Factory theBpmn2Factory = (Bpmn2Factory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.omg.org/spec/BPMN/20100524/MODEL-XMI");
			if (theBpmn2Factory != null) {
				return theBpmn2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bpmn2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public Bpmn2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Bpmn2Package.INTERFACE:
			return (EObject) createInterface();
		case Bpmn2Package.EXTENSION_DEFINITION:
			return (EObject) createExtensionDefinition();
		case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION:
			return (EObject) createExtensionAttributeDefinition();
		case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE:
			return (EObject) createExtensionAttributeValue();
		case Bpmn2Package.DOCUMENTATION:
			return (EObject) createDocumentation();
		case Bpmn2Package.OPERATION:
			return (EObject) createOperation();
		case Bpmn2Package.MESSAGE:
			return (EObject) createMessage();
		case Bpmn2Package.ITEM_DEFINITION:
			return (EObject) createItemDefinition();
		case Bpmn2Package.IMPORT:
			return (EObject) createImport();
		case Bpmn2Package.ERROR:
			return (EObject) createError();
		case Bpmn2Package.END_POINT:
			return (EObject) createEndPoint();
		case Bpmn2Package.AUDITING:
			return (EObject) createAuditing();
		case Bpmn2Package.GLOBAL_TASK:
			return (EObject) createGlobalTask();
		case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION:
			return (EObject) createInputOutputSpecification();
		case Bpmn2Package.INPUT_SET:
			return (EObject) createInputSet();
		case Bpmn2Package.DATA_INPUT:
			return (EObject) createDataInput();
		case Bpmn2Package.ITEM_AWARE_ELEMENT:
			return (EObject) createItemAwareElement();
		case Bpmn2Package.DATA_STATE:
			return (EObject) createDataState();
		case Bpmn2Package.OUTPUT_SET:
			return (EObject) createOutputSet();
		case Bpmn2Package.DATA_OUTPUT:
			return (EObject) createDataOutput();
		case Bpmn2Package.INPUT_OUTPUT_BINDING:
			return (EObject) createInputOutputBinding();
		case Bpmn2Package.RESOURCE_ROLE:
			return (EObject) createResourceRole();
		case Bpmn2Package.RESOURCE:
			return (EObject) createResource();
		case Bpmn2Package.RESOURCE_PARAMETER:
			return (EObject) createResourceParameter();
		case Bpmn2Package.RESOURCE_PARAMETER_BINDING:
			return (EObject) createResourceParameterBinding();
		case Bpmn2Package.EXPRESSION:
			return (EObject) createExpression();
		case Bpmn2Package.RESOURCE_ASSIGNMENT_EXPRESSION:
			return (EObject) createResourceAssignmentExpression();
		case Bpmn2Package.MONITORING:
			return (EObject) createMonitoring();
		case Bpmn2Package.PERFORMER:
			return (EObject) createPerformer();
		case Bpmn2Package.PROCESS:
			return (EObject) createProcess();
		case Bpmn2Package.CATEGORY_VALUE:
			return (EObject) createCategoryValue();
		case Bpmn2Package.LANE_SET:
			return (EObject) createLaneSet();
		case Bpmn2Package.LANE:
			return (EObject) createLane();
		case Bpmn2Package.SEQUENCE_FLOW:
			return (EObject) createSequenceFlow();
		case Bpmn2Package.PROPERTY:
			return (EObject) createProperty();
		case Bpmn2Package.COLLABORATION:
			return (EObject) createCollaboration();
		case Bpmn2Package.CHOREOGRAPHY:
			return (EObject) createChoreography();
		case Bpmn2Package.PARTICIPANT_ASSOCIATION:
			return (EObject) createParticipantAssociation();
		case Bpmn2Package.PARTICIPANT:
			return (EObject) createParticipant();
		case Bpmn2Package.CONVERSATION_LINK:
			return (EObject) createConversationLink();
		case Bpmn2Package.PARTICIPANT_MULTIPLICITY:
			return (EObject) createParticipantMultiplicity();
		case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION:
			return (EObject) createMessageFlowAssociation();
		case Bpmn2Package.MESSAGE_FLOW:
			return (EObject) createMessageFlow();
		case Bpmn2Package.CONVERSATION_ASSOCIATION:
			return (EObject) createConversationAssociation();
		case Bpmn2Package.CORRELATION_KEY:
			return (EObject) createCorrelationKey();
		case Bpmn2Package.CORRELATION_PROPERTY:
			return (EObject) createCorrelationProperty();
		case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
			return (EObject) createCorrelationPropertyRetrievalExpression();
		case Bpmn2Package.FORMAL_EXPRESSION:
			return (EObject) createFormalExpression();
		case Bpmn2Package.CORRELATION_SUBSCRIPTION:
			return (EObject) createCorrelationSubscription();
		case Bpmn2Package.CORRELATION_PROPERTY_BINDING:
			return (EObject) createCorrelationPropertyBinding();
		case Bpmn2Package.GLOBAL_MANUAL_TASK:
			return (EObject) createGlobalManualTask();
		case Bpmn2Package.MANUAL_TASK:
			return (EObject) createManualTask();
		case Bpmn2Package.TASK:
			return (EObject) createTask();
		case Bpmn2Package.BOUNDARY_EVENT:
			return (EObject) createBoundaryEvent();
		case Bpmn2Package.DATA_OUTPUT_ASSOCIATION:
			return (EObject) createDataOutputAssociation();
		case Bpmn2Package.DATA_ASSOCIATION:
			return (EObject) createDataAssociation();
		case Bpmn2Package.ASSIGNMENT:
			return (EObject) createAssignment();
		case Bpmn2Package.DATA_INPUT_ASSOCIATION:
			return (EObject) createDataInputAssociation();
		case Bpmn2Package.USER_TASK:
			return (EObject) createUserTask();
		case Bpmn2Package.RENDERING:
			return (EObject) createRendering();
		case Bpmn2Package.HUMAN_PERFORMER:
			return (EObject) createHumanPerformer();
		case Bpmn2Package.POTENTIAL_OWNER:
			return (EObject) createPotentialOwner();
		case Bpmn2Package.GLOBAL_USER_TASK:
			return (EObject) createGlobalUserTask();
		case Bpmn2Package.EVENT_BASED_GATEWAY:
			return (EObject) createEventBasedGateway();
		case Bpmn2Package.COMPLEX_GATEWAY:
			return (EObject) createComplexGateway();
		case Bpmn2Package.EXCLUSIVE_GATEWAY:
			return (EObject) createExclusiveGateway();
		case Bpmn2Package.INCLUSIVE_GATEWAY:
			return (EObject) createInclusiveGateway();
		case Bpmn2Package.PARALLEL_GATEWAY:
			return (EObject) createParallelGateway();
		case Bpmn2Package.RELATIONSHIP:
			return (EObject) createRelationship();
		case Bpmn2Package.EXTENSION:
			return (EObject) createExtension();
		case Bpmn2Package.INTERMEDIATE_CATCH_EVENT:
			return (EObject) createIntermediateCatchEvent();
		case Bpmn2Package.INTERMEDIATE_THROW_EVENT:
			return (EObject) createIntermediateThrowEvent();
		case Bpmn2Package.END_EVENT:
			return (EObject) createEndEvent();
		case Bpmn2Package.START_EVENT:
			return (EObject) createStartEvent();
		case Bpmn2Package.CANCEL_EVENT_DEFINITION:
			return (EObject) createCancelEventDefinition();
		case Bpmn2Package.ERROR_EVENT_DEFINITION:
			return (EObject) createErrorEventDefinition();
		case Bpmn2Package.TERMINATE_EVENT_DEFINITION:
			return (EObject) createTerminateEventDefinition();
		case Bpmn2Package.ESCALATION_EVENT_DEFINITION:
			return (EObject) createEscalationEventDefinition();
		case Bpmn2Package.ESCALATION:
			return (EObject) createEscalation();
		case Bpmn2Package.COMPENSATE_EVENT_DEFINITION:
			return (EObject) createCompensateEventDefinition();
		case Bpmn2Package.TIMER_EVENT_DEFINITION:
			return (EObject) createTimerEventDefinition();
		case Bpmn2Package.LINK_EVENT_DEFINITION:
			return (EObject) createLinkEventDefinition();
		case Bpmn2Package.MESSAGE_EVENT_DEFINITION:
			return (EObject) createMessageEventDefinition();
		case Bpmn2Package.CONDITIONAL_EVENT_DEFINITION:
			return (EObject) createConditionalEventDefinition();
		case Bpmn2Package.SIGNAL_EVENT_DEFINITION:
			return (EObject) createSignalEventDefinition();
		case Bpmn2Package.SIGNAL:
			return (EObject) createSignal();
		case Bpmn2Package.IMPLICIT_THROW_EVENT:
			return (EObject) createImplicitThrowEvent();
		case Bpmn2Package.DATA_OBJECT:
			return (EObject) createDataObject();
		case Bpmn2Package.DATA_STORE:
			return (EObject) createDataStore();
		case Bpmn2Package.DATA_STORE_REFERENCE:
			return (EObject) createDataStoreReference();
		case Bpmn2Package.DATA_OBJECT_REFERENCE:
			return (EObject) createDataObjectReference();
		case Bpmn2Package.CALL_CONVERSATION:
			return (EObject) createCallConversation();
		case Bpmn2Package.CONVERSATION:
			return (EObject) createConversation();
		case Bpmn2Package.SUB_CONVERSATION:
			return (EObject) createSubConversation();
		case Bpmn2Package.GLOBAL_CONVERSATION:
			return (EObject) createGlobalConversation();
		case Bpmn2Package.PARTNER_ENTITY:
			return (EObject) createPartnerEntity();
		case Bpmn2Package.PARTNER_ROLE:
			return (EObject) createPartnerRole();
		case Bpmn2Package.CALL_CHOREOGRAPHY:
			return (EObject) createCallChoreography();
		case Bpmn2Package.SUB_CHOREOGRAPHY:
			return (EObject) createSubChoreography();
		case Bpmn2Package.CHOREOGRAPHY_TASK:
			return (EObject) createChoreographyTask();
		case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK:
			return (EObject) createGlobalChoreographyTask();
		case Bpmn2Package.TEXT_ANNOTATION:
			return (EObject) createTextAnnotation();
		case Bpmn2Package.GROUP:
			return (EObject) createGroup();
		case Bpmn2Package.ASSOCIATION:
			return (EObject) createAssociation();
		case Bpmn2Package.CATEGORY:
			return (EObject) createCategory();
		case Bpmn2Package.SERVICE_TASK:
			return (EObject) createServiceTask();
		case Bpmn2Package.SUB_PROCESS:
			return (EObject) createSubProcess();
		case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS:
			return (EObject) createMultiInstanceLoopCharacteristics();
		case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION:
			return (EObject) createComplexBehaviorDefinition();
		case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS:
			return (EObject) createStandardLoopCharacteristics();
		case Bpmn2Package.CALL_ACTIVITY:
			return (EObject) createCallActivity();
		case Bpmn2Package.SEND_TASK:
			return (EObject) createSendTask();
		case Bpmn2Package.RECEIVE_TASK:
			return (EObject) createReceiveTask();
		case Bpmn2Package.SCRIPT_TASK:
			return (EObject) createScriptTask();
		case Bpmn2Package.BUSINESS_RULE_TASK:
			return (EObject) createBusinessRuleTask();
		case Bpmn2Package.AD_HOC_SUB_PROCESS:
			return (EObject) createAdHocSubProcess();
		case Bpmn2Package.TRANSACTION:
			return (EObject) createTransaction();
		case Bpmn2Package.GLOBAL_SCRIPT_TASK:
			return (EObject) createGlobalScriptTask();
		case Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK:
			return (EObject) createGlobalBusinessRuleTask();
		case Bpmn2Package.DEFINITIONS:
			return (EObject) createDefinitions();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Bpmn2Package.ITEM_KIND:
			return createItemKindFromString(eDataType, initialValue);
		case Bpmn2Package.PROCESS_TYPE:
			return createProcessTypeFromString(eDataType, initialValue);
		case Bpmn2Package.GATEWAY_DIRECTION:
			return createGatewayDirectionFromString(eDataType, initialValue);
		case Bpmn2Package.EVENT_BASED_GATEWAY_TYPE:
			return createEventBasedGatewayTypeFromString(eDataType, initialValue);
		case Bpmn2Package.RELATIONSHIP_DIRECTION:
			return createRelationshipDirectionFromString(eDataType, initialValue);
		case Bpmn2Package.CHOREOGRAPHY_LOOP_TYPE:
			return createChoreographyLoopTypeFromString(eDataType, initialValue);
		case Bpmn2Package.ASSOCIATION_DIRECTION:
			return createAssociationDirectionFromString(eDataType, initialValue);
		case Bpmn2Package.MULTI_INSTANCE_BEHAVIOR:
			return createMultiInstanceBehaviorFromString(eDataType, initialValue);
		case Bpmn2Package.AD_HOC_ORDERING:
			return createAdHocOrderingFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Bpmn2Package.ITEM_KIND:
			return convertItemKindToString(eDataType, instanceValue);
		case Bpmn2Package.PROCESS_TYPE:
			return convertProcessTypeToString(eDataType, instanceValue);
		case Bpmn2Package.GATEWAY_DIRECTION:
			return convertGatewayDirectionToString(eDataType, instanceValue);
		case Bpmn2Package.EVENT_BASED_GATEWAY_TYPE:
			return convertEventBasedGatewayTypeToString(eDataType, instanceValue);
		case Bpmn2Package.RELATIONSHIP_DIRECTION:
			return convertRelationshipDirectionToString(eDataType, instanceValue);
		case Bpmn2Package.CHOREOGRAPHY_LOOP_TYPE:
			return convertChoreographyLoopTypeToString(eDataType, instanceValue);
		case Bpmn2Package.ASSOCIATION_DIRECTION:
			return convertAssociationDirectionToString(eDataType, instanceValue);
		case Bpmn2Package.MULTI_INSTANCE_BEHAVIOR:
			return convertMultiInstanceBehaviorToString(eDataType, instanceValue);
		case Bpmn2Package.AD_HOC_ORDERING:
			return convertAdHocOrderingToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExtensionDefinition createExtensionDefinition() {
		ExtensionDefinitionImpl extensionDefinition = new ExtensionDefinitionImpl();
		return extensionDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExtensionAttributeDefinition createExtensionAttributeDefinition() {
		ExtensionAttributeDefinitionImpl extensionAttributeDefinition = new ExtensionAttributeDefinitionImpl();
		return extensionAttributeDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExtensionAttributeValue createExtensionAttributeValue() {
		ExtensionAttributeValueImpl extensionAttributeValue = new ExtensionAttributeValueImpl();
		return extensionAttributeValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ItemDefinition createItemDefinition() {
		ItemDefinitionImpl itemDefinition = new ItemDefinitionImpl();
		return itemDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.obeonetwork.dsl.bpmn2.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EndPoint createEndPoint() {
		EndPointImpl endPoint = new EndPointImpl();
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Auditing createAuditing() {
		AuditingImpl auditing = new AuditingImpl();
		return auditing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GlobalTask createGlobalTask() {
		GlobalTaskImpl globalTask = new GlobalTaskImpl();
		return globalTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InputOutputSpecification createInputOutputSpecification() {
		InputOutputSpecificationImpl inputOutputSpecification = new InputOutputSpecificationImpl();
		return inputOutputSpecification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InputSet createInputSet() {
		InputSetImpl inputSet = new InputSetImpl();
		return inputSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataInput createDataInput() {
		DataInputImpl dataInput = new DataInputImpl();
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ItemAwareElement createItemAwareElement() {
		ItemAwareElementImpl itemAwareElement = new ItemAwareElementImpl();
		return itemAwareElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataState createDataState() {
		DataStateImpl dataState = new DataStateImpl();
		return dataState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OutputSet createOutputSet() {
		OutputSetImpl outputSet = new OutputSetImpl();
		return outputSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataOutput createDataOutput() {
		DataOutputImpl dataOutput = new DataOutputImpl();
		return dataOutput;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InputOutputBinding createInputOutputBinding() {
		InputOutputBindingImpl inputOutputBinding = new InputOutputBindingImpl();
		return inputOutputBinding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceRole createResourceRole() {
		ResourceRoleImpl resourceRole = new ResourceRoleImpl();
		return resourceRole;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceParameter createResourceParameter() {
		ResourceParameterImpl resourceParameter = new ResourceParameterImpl();
		return resourceParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceParameterBinding createResourceParameterBinding() {
		ResourceParameterBindingImpl resourceParameterBinding = new ResourceParameterBindingImpl();
		return resourceParameterBinding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceAssignmentExpression createResourceAssignmentExpression() {
		ResourceAssignmentExpressionImpl resourceAssignmentExpression = new ResourceAssignmentExpressionImpl();
		return resourceAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Monitoring createMonitoring() {
		MonitoringImpl monitoring = new MonitoringImpl();
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Performer createPerformer() {
		PerformerImpl performer = new PerformerImpl();
		return performer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public org.obeonetwork.dsl.bpmn2.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		LaneSet laneSet = this.createLaneSet();
		process.getLaneSets().add(laneSet);
		Lane lane = this.createLane();
		laneSet.getLanes().add(lane);
		return process;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CategoryValue createCategoryValue() {
		CategoryValueImpl categoryValue = new CategoryValueImpl();
		return categoryValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LaneSet createLaneSet() {
		LaneSetImpl laneSet = new LaneSetImpl();
		return laneSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Choreography createChoreography() {
		ChoreographyImpl choreography = new ChoreographyImpl();
		return choreography;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParticipantAssociation createParticipantAssociation() {
		ParticipantAssociationImpl participantAssociation = new ParticipantAssociationImpl();
		return participantAssociation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConversationLink createConversationLink() {
		ConversationLinkImpl conversationLink = new ConversationLinkImpl();
		return conversationLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParticipantMultiplicity createParticipantMultiplicity() {
		ParticipantMultiplicityImpl participantMultiplicity = new ParticipantMultiplicityImpl();
		return participantMultiplicity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MessageFlowAssociation createMessageFlowAssociation() {
		MessageFlowAssociationImpl messageFlowAssociation = new MessageFlowAssociationImpl();
		return messageFlowAssociation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MessageFlow createMessageFlow() {
		MessageFlowImpl messageFlow = new MessageFlowImpl();
		return messageFlow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConversationAssociation createConversationAssociation() {
		ConversationAssociationImpl conversationAssociation = new ConversationAssociationImpl();
		return conversationAssociation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CorrelationKey createCorrelationKey() {
		CorrelationKeyImpl correlationKey = new CorrelationKeyImpl();
		return correlationKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CorrelationProperty createCorrelationProperty() {
		CorrelationPropertyImpl correlationProperty = new CorrelationPropertyImpl();
		return correlationProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression() {
		CorrelationPropertyRetrievalExpressionImpl correlationPropertyRetrievalExpression = new CorrelationPropertyRetrievalExpressionImpl();
		return correlationPropertyRetrievalExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FormalExpression createFormalExpression() {
		FormalExpressionImpl formalExpression = new FormalExpressionImpl();
		return formalExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CorrelationSubscription createCorrelationSubscription() {
		CorrelationSubscriptionImpl correlationSubscription = new CorrelationSubscriptionImpl();
		return correlationSubscription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CorrelationPropertyBinding createCorrelationPropertyBinding() {
		CorrelationPropertyBindingImpl correlationPropertyBinding = new CorrelationPropertyBindingImpl();
		return correlationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GlobalManualTask createGlobalManualTask() {
		GlobalManualTaskImpl globalManualTask = new GlobalManualTaskImpl();
		return globalManualTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ManualTask createManualTask() {
		ManualTaskImpl manualTask = new ManualTaskImpl();
		return manualTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BoundaryEvent createBoundaryEvent() {
		BoundaryEventImpl boundaryEvent = new BoundaryEventImpl();
		return boundaryEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataOutputAssociation createDataOutputAssociation() {
		DataOutputAssociationImpl dataOutputAssociation = new DataOutputAssociationImpl();
		return dataOutputAssociation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataAssociation createDataAssociation() {
		DataAssociationImpl dataAssociation = new DataAssociationImpl();
		return dataAssociation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataInputAssociation createDataInputAssociation() {
		DataInputAssociationImpl dataInputAssociation = new DataInputAssociationImpl();
		return dataInputAssociation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Rendering createRendering() {
		RenderingImpl rendering = new RenderingImpl();
		return rendering;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HumanPerformer createHumanPerformer() {
		HumanPerformerImpl humanPerformer = new HumanPerformerImpl();
		return humanPerformer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PotentialOwner createPotentialOwner() {
		PotentialOwnerImpl potentialOwner = new PotentialOwnerImpl();
		return potentialOwner;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GlobalUserTask createGlobalUserTask() {
		GlobalUserTaskImpl globalUserTask = new GlobalUserTaskImpl();
		return globalUserTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EventBasedGateway createEventBasedGateway() {
		EventBasedGatewayImpl eventBasedGateway = new EventBasedGatewayImpl();
		return eventBasedGateway;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComplexGateway createComplexGateway() {
		ComplexGatewayImpl complexGateway = new ComplexGatewayImpl();
		return complexGateway;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExclusiveGateway createExclusiveGateway() {
		ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();
		return exclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InclusiveGateway createInclusiveGateway() {
		InclusiveGatewayImpl inclusiveGateway = new InclusiveGatewayImpl();
		return inclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParallelGateway createParallelGateway() {
		ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
		return parallelGateway;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntermediateCatchEvent createIntermediateCatchEvent() {
		IntermediateCatchEventImpl intermediateCatchEvent = new IntermediateCatchEventImpl();
		return intermediateCatchEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntermediateThrowEvent createIntermediateThrowEvent() {
		IntermediateThrowEventImpl intermediateThrowEvent = new IntermediateThrowEventImpl();
		return intermediateThrowEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CancelEventDefinition createCancelEventDefinition() {
		CancelEventDefinitionImpl cancelEventDefinition = new CancelEventDefinitionImpl();
		return cancelEventDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ErrorEventDefinition createErrorEventDefinition() {
		ErrorEventDefinitionImpl errorEventDefinition = new ErrorEventDefinitionImpl();
		return errorEventDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TerminateEventDefinition createTerminateEventDefinition() {
		TerminateEventDefinitionImpl terminateEventDefinition = new TerminateEventDefinitionImpl();
		return terminateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EscalationEventDefinition createEscalationEventDefinition() {
		EscalationEventDefinitionImpl escalationEventDefinition = new EscalationEventDefinitionImpl();
		return escalationEventDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Escalation createEscalation() {
		EscalationImpl escalation = new EscalationImpl();
		return escalation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompensateEventDefinition createCompensateEventDefinition() {
		CompensateEventDefinitionImpl compensateEventDefinition = new CompensateEventDefinitionImpl();
		return compensateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TimerEventDefinition createTimerEventDefinition() {
		TimerEventDefinitionImpl timerEventDefinition = new TimerEventDefinitionImpl();
		return timerEventDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LinkEventDefinition createLinkEventDefinition() {
		LinkEventDefinitionImpl linkEventDefinition = new LinkEventDefinitionImpl();
		return linkEventDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MessageEventDefinition createMessageEventDefinition() {
		MessageEventDefinitionImpl messageEventDefinition = new MessageEventDefinitionImpl();
		return messageEventDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConditionalEventDefinition createConditionalEventDefinition() {
		ConditionalEventDefinitionImpl conditionalEventDefinition = new ConditionalEventDefinitionImpl();
		return conditionalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SignalEventDefinition createSignalEventDefinition() {
		SignalEventDefinitionImpl signalEventDefinition = new SignalEventDefinitionImpl();
		return signalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ImplicitThrowEvent createImplicitThrowEvent() {
		ImplicitThrowEventImpl implicitThrowEvent = new ImplicitThrowEventImpl();
		return implicitThrowEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataObject createDataObject() {
		DataObjectImpl dataObject = new DataObjectImpl();
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataStore createDataStore() {
		DataStoreImpl dataStore = new DataStoreImpl();
		return dataStore;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataStoreReference createDataStoreReference() {
		DataStoreReferenceImpl dataStoreReference = new DataStoreReferenceImpl();
		return dataStoreReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataObjectReference createDataObjectReference() {
		DataObjectReferenceImpl dataObjectReference = new DataObjectReferenceImpl();
		return dataObjectReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CallConversation createCallConversation() {
		CallConversationImpl callConversation = new CallConversationImpl();
		return callConversation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Conversation createConversation() {
		ConversationImpl conversation = new ConversationImpl();
		return conversation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SubConversation createSubConversation() {
		SubConversationImpl subConversation = new SubConversationImpl();
		return subConversation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GlobalConversation createGlobalConversation() {
		GlobalConversationImpl globalConversation = new GlobalConversationImpl();
		return globalConversation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PartnerEntity createPartnerEntity() {
		PartnerEntityImpl partnerEntity = new PartnerEntityImpl();
		return partnerEntity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PartnerRole createPartnerRole() {
		PartnerRoleImpl partnerRole = new PartnerRoleImpl();
		return partnerRole;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CallChoreography createCallChoreography() {
		CallChoreographyImpl callChoreography = new CallChoreographyImpl();
		return callChoreography;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SubChoreography createSubChoreography() {
		SubChoreographyImpl subChoreography = new SubChoreographyImpl();
		return subChoreography;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChoreographyTask createChoreographyTask() {
		ChoreographyTaskImpl choreographyTask = new ChoreographyTaskImpl();
		return choreographyTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GlobalChoreographyTask createGlobalChoreographyTask() {
		GlobalChoreographyTaskImpl globalChoreographyTask = new GlobalChoreographyTaskImpl();
		return globalChoreographyTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TextAnnotation createTextAnnotation() {
		TextAnnotationImpl textAnnotation = new TextAnnotationImpl();
		return textAnnotation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceTask createServiceTask() {
		ServiceTaskImpl serviceTask = new ServiceTaskImpl();
		return serviceTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SubProcess createSubProcess() {
		SubProcessImpl subProcess = new SubProcessImpl();
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MultiInstanceLoopCharacteristics createMultiInstanceLoopCharacteristics() {
		MultiInstanceLoopCharacteristicsImpl multiInstanceLoopCharacteristics = new MultiInstanceLoopCharacteristicsImpl();
		return multiInstanceLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComplexBehaviorDefinition createComplexBehaviorDefinition() {
		ComplexBehaviorDefinitionImpl complexBehaviorDefinition = new ComplexBehaviorDefinitionImpl();
		return complexBehaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StandardLoopCharacteristics createStandardLoopCharacteristics() {
		StandardLoopCharacteristicsImpl standardLoopCharacteristics = new StandardLoopCharacteristicsImpl();
		return standardLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CallActivity createCallActivity() {
		CallActivityImpl callActivity = new CallActivityImpl();
		return callActivity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SendTask createSendTask() {
		SendTaskImpl sendTask = new SendTaskImpl();
		return sendTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReceiveTask createReceiveTask() {
		ReceiveTaskImpl receiveTask = new ReceiveTaskImpl();
		return receiveTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScriptTask createScriptTask() {
		ScriptTaskImpl scriptTask = new ScriptTaskImpl();
		return scriptTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BusinessRuleTask createBusinessRuleTask() {
		BusinessRuleTaskImpl businessRuleTask = new BusinessRuleTaskImpl();
		return businessRuleTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdHocSubProcess createAdHocSubProcess() {
		AdHocSubProcessImpl adHocSubProcess = new AdHocSubProcessImpl();
		return adHocSubProcess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GlobalScriptTask createGlobalScriptTask() {
		GlobalScriptTaskImpl globalScriptTask = new GlobalScriptTaskImpl();
		return globalScriptTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GlobalBusinessRuleTask createGlobalBusinessRuleTask() {
		GlobalBusinessRuleTaskImpl globalBusinessRuleTask = new GlobalBusinessRuleTaskImpl();
		return globalBusinessRuleTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Definitions createDefinitions() {
		DefinitionsImpl definitions = new DefinitionsImpl();
		return definitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ItemKind createItemKindFromString(EDataType eDataType, String initialValue) {
		ItemKind result = ItemKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProcessType createProcessTypeFromString(EDataType eDataType, String initialValue) {
		ProcessType result = ProcessType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertProcessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GatewayDirection createGatewayDirectionFromString(EDataType eDataType, String initialValue) {
		GatewayDirection result = GatewayDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertGatewayDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EventBasedGatewayType createEventBasedGatewayTypeFromString(EDataType eDataType, String initialValue) {
		EventBasedGatewayType result = EventBasedGatewayType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertEventBasedGatewayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RelationshipDirection createRelationshipDirectionFromString(EDataType eDataType, String initialValue) {
		RelationshipDirection result = RelationshipDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertRelationshipDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChoreographyLoopType createChoreographyLoopTypeFromString(EDataType eDataType, String initialValue) {
		ChoreographyLoopType result = ChoreographyLoopType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertChoreographyLoopTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDirection createAssociationDirectionFromString(EDataType eDataType, String initialValue) {
		AssociationDirection result = AssociationDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MultiInstanceBehavior createMultiInstanceBehaviorFromString(EDataType eDataType, String initialValue) {
		MultiInstanceBehavior result = MultiInstanceBehavior.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMultiInstanceBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdHocOrdering createAdHocOrderingFromString(EDataType eDataType, String initialValue) {
		AdHocOrdering result = AdHocOrdering.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAdHocOrderingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Bpmn2Package getBpmn2Package() {
		return (Bpmn2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bpmn2Package getPackage() {
		return Bpmn2Package.eINSTANCE;
	}

} // Bpmn2FactoryImpl

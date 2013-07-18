/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;

import org.obeonetwork.dsl.bpmn2.parts.forms.AdHocSubProcessPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.AssignmentPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.AssociationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.AuditingPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.BoundaryEventPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.BusinessRuleTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CallActivityPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CallChoreographyPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CallConversationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CancelEventDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CategoryPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CategoryValuePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ChoreographyPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ChoreographyTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CollaborationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CompensateEventDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ComplexBehaviorDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ComplexGatewayPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ConditionalEventDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ConversationAssociationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ConversationLinkPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ConversationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CorrelationKeyPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CorrelationPropertyBindingPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CorrelationPropertyPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CorrelationPropertyRetrievalExpressionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.CorrelationSubscriptionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DataAssociationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DataInputAssociationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DataInputPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DataObjectPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DataObjectReferencePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DataOutputAssociationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DataOutputPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DataStatePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DataStorePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DataStoreReferencePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DefinitionsPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.DocumentationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.EndEventPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.EndPointPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ErrorEventDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ErrorPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.EscalationEventDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.EscalationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.EventBasedGatewayPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ExclusiveGatewayPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ExpressionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ExtensionAttributeDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ExtensionAttributeValuePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ExtensionDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ExtensionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.FormalExpressionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.GlobalBusinessRuleTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.GlobalChoreographyTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.GlobalConversationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.GlobalManualTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.GlobalScriptTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.GlobalTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.GlobalUserTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.GroupPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.HumanPerformerPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ImplicitThrowEventPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.Import_PropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.InclusiveGatewayPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.InputOutputBindingPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.InputOutputSpecificationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.InputSetPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.Interface_PropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.IntermediateCatchEventPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.IntermediateThrowEventPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ItemAwareElementPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ItemDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.LanePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.LaneSetPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.LinkEventDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ManualTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.MessageEventDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.MessageFlowAssociationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.MessageFlowPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.MessagePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.MonitoringPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.MultiInstanceLoopCharacteristicsPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.OperationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.OutputSetPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ParallelGatewayPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ParticipantAssociationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ParticipantMultiplicityPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ParticipantPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.PartnerEntityPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.PartnerRolePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.PerformerPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.PotentialOwnerPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ProcessPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.PropertyPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ReceiveTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.RelationshipPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.RenderingPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ResourceAssignmentExpressionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ResourceParameterBindingPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ResourceParameterPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ResourcePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ResourceRolePropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ScriptTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.SendTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.SequenceFlowPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.ServiceTaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.SignalEventDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.SignalPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.StandardLoopCharacteristicsPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.StartEventPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.SubChoreographyPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.SubConversationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.SubProcessPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.TaskPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.TerminateEventDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.TextAnnotationPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.TimerEventDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.TransactionPropertiesEditionPartForm;
import org.obeonetwork.dsl.bpmn2.parts.forms.UserTaskPropertiesEditionPartForm;

import org.obeonetwork.dsl.bpmn2.parts.impl.AdHocSubProcessPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.AssignmentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.AssociationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.AuditingPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.BoundaryEventPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.BusinessRuleTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CallActivityPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CallChoreographyPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CallConversationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CancelEventDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CategoryPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CategoryValuePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ChoreographyPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ChoreographyTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CollaborationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CompensateEventDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ComplexBehaviorDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ComplexGatewayPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ConditionalEventDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ConversationAssociationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ConversationLinkPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ConversationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CorrelationKeyPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CorrelationPropertyBindingPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CorrelationPropertyPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CorrelationPropertyRetrievalExpressionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.CorrelationSubscriptionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DataAssociationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DataInputAssociationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DataInputPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DataObjectPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DataObjectReferencePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DataOutputAssociationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DataOutputPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DataStatePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DataStorePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DataStoreReferencePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DefinitionsPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.DocumentationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.EndEventPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.EndPointPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ErrorEventDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ErrorPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.EscalationEventDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.EscalationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.EventBasedGatewayPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ExclusiveGatewayPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ExpressionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ExtensionAttributeDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ExtensionAttributeValuePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ExtensionDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ExtensionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.FormalExpressionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.GlobalBusinessRuleTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.GlobalChoreographyTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.GlobalConversationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.GlobalManualTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.GlobalScriptTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.GlobalTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.GlobalUserTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.GroupPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.HumanPerformerPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ImplicitThrowEventPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.Import_PropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.InclusiveGatewayPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.InputOutputBindingPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.InputOutputSpecificationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.InputSetPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.Interface_PropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.IntermediateCatchEventPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.IntermediateThrowEventPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ItemAwareElementPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ItemDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.LanePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.LaneSetPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.LinkEventDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ManualTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.MessageEventDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.MessageFlowAssociationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.MessageFlowPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.MessagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.MonitoringPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.MultiInstanceLoopCharacteristicsPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.OperationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.OutputSetPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ParallelGatewayPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ParticipantAssociationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ParticipantMultiplicityPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ParticipantPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.PartnerEntityPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.PartnerRolePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.PerformerPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.PotentialOwnerPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ProcessPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.PropertyPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ReceiveTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.RelationshipPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.RenderingPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ResourceAssignmentExpressionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ResourceParameterBindingPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ResourceParameterPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ResourcePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ResourceRolePropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ScriptTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.SendTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.SequenceFlowPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.ServiceTaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.SignalEventDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.SignalPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.StandardLoopCharacteristicsPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.StartEventPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.SubChoreographyPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.SubConversationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.SubProcessPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.TaskPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.TerminateEventDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.TextAnnotationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.TimerEventDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.TransactionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.bpmn2.parts.impl.UserTaskPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class Bpmn2PropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == Bpmn2ViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == Bpmn2ViewsRepository.Interface_.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new Interface_PropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new Interface_PropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ExtensionDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ExtensionDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ExtensionDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ExtensionAttributeDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ExtensionAttributeDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ExtensionAttributeDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ExtensionAttributeValue.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ExtensionAttributeValuePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ExtensionAttributeValuePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Documentation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DocumentationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DocumentationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Operation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new OperationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new OperationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Message.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new MessagePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new MessagePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ItemDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ItemDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ItemDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Import_.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new Import_PropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new Import_PropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Error.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ErrorPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ErrorPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.EndPoint.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new EndPointPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new EndPointPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Auditing.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new AuditingPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new AuditingPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.GlobalTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new GlobalTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new GlobalTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.InputOutputSpecification.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new InputOutputSpecificationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new InputOutputSpecificationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.InputSet.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new InputSetPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new InputSetPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.DataInput.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DataInputPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DataInputPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ItemAwareElement.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ItemAwareElementPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ItemAwareElementPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.DataState.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DataStatePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DataStatePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.OutputSet.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new OutputSetPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new OutputSetPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.DataOutput.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DataOutputPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DataOutputPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.InputOutputBinding.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new InputOutputBindingPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new InputOutputBindingPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ResourceRole.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ResourceRolePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ResourceRolePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Resource.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ResourcePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ResourcePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ResourceParameter.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ResourceParameterPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ResourceParameterPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ResourceParameterBinding.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ResourceParameterBindingPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ResourceParameterBindingPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Expression.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ExpressionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ExpressionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ResourceAssignmentExpression.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ResourceAssignmentExpressionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ResourceAssignmentExpressionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Monitoring.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new MonitoringPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new MonitoringPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Performer.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new PerformerPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new PerformerPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Process.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ProcessPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ProcessPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CategoryValue.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CategoryValuePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CategoryValuePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.LaneSet.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new LaneSetPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new LaneSetPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Lane.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new LanePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new LanePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.SequenceFlow.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new SequenceFlowPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new SequenceFlowPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Property.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new PropertyPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new PropertyPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Collaboration.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CollaborationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CollaborationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Choreography.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ChoreographyPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ChoreographyPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ParticipantAssociation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ParticipantAssociationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ParticipantAssociationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Participant.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ParticipantPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ParticipantPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ConversationLink.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ConversationLinkPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ConversationLinkPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ParticipantMultiplicity.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ParticipantMultiplicityPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ParticipantMultiplicityPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.MessageFlowAssociation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new MessageFlowAssociationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new MessageFlowAssociationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.MessageFlow.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new MessageFlowPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new MessageFlowPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ConversationAssociation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ConversationAssociationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ConversationAssociationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CorrelationKey.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CorrelationKeyPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CorrelationKeyPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CorrelationProperty.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CorrelationPropertyPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CorrelationPropertyPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CorrelationPropertyRetrievalExpression.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CorrelationPropertyRetrievalExpressionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CorrelationPropertyRetrievalExpressionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.FormalExpression.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new FormalExpressionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new FormalExpressionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CorrelationSubscription.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CorrelationSubscriptionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CorrelationSubscriptionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CorrelationPropertyBinding.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CorrelationPropertyBindingPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CorrelationPropertyBindingPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.GlobalManualTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new GlobalManualTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new GlobalManualTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ManualTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ManualTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ManualTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Task.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new TaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new TaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.BoundaryEvent.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new BoundaryEventPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new BoundaryEventPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.DataOutputAssociation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DataOutputAssociationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DataOutputAssociationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.DataAssociation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DataAssociationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DataAssociationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Assignment.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new AssignmentPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new AssignmentPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.DataInputAssociation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DataInputAssociationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DataInputAssociationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.UserTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new UserTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new UserTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Rendering.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new RenderingPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new RenderingPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.HumanPerformer.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new HumanPerformerPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new HumanPerformerPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.PotentialOwner.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new PotentialOwnerPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new PotentialOwnerPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.GlobalUserTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new GlobalUserTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new GlobalUserTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.EventBasedGateway.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new EventBasedGatewayPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new EventBasedGatewayPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ComplexGateway.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ComplexGatewayPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ComplexGatewayPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ExclusiveGateway.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ExclusiveGatewayPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ExclusiveGatewayPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.InclusiveGateway.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new InclusiveGatewayPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new InclusiveGatewayPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ParallelGateway.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ParallelGatewayPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ParallelGatewayPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Relationship.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new RelationshipPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new RelationshipPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Extension.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ExtensionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ExtensionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.IntermediateCatchEvent.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new IntermediateCatchEventPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new IntermediateCatchEventPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.IntermediateThrowEvent.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new IntermediateThrowEventPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new IntermediateThrowEventPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.EndEvent.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new EndEventPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new EndEventPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.StartEvent.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new StartEventPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new StartEventPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CancelEventDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CancelEventDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CancelEventDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ErrorEventDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ErrorEventDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ErrorEventDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.TerminateEventDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new TerminateEventDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new TerminateEventDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.EscalationEventDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new EscalationEventDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new EscalationEventDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Escalation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new EscalationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new EscalationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CompensateEventDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CompensateEventDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CompensateEventDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.TimerEventDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new TimerEventDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new TimerEventDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.LinkEventDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new LinkEventDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new LinkEventDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.MessageEventDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new MessageEventDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new MessageEventDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ConditionalEventDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ConditionalEventDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ConditionalEventDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.SignalEventDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new SignalEventDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new SignalEventDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Signal.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new SignalPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new SignalPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ImplicitThrowEvent.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ImplicitThrowEventPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ImplicitThrowEventPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.DataObject.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DataObjectPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DataObjectPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.DataStore.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DataStorePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DataStorePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.DataStoreReference.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DataStoreReferencePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DataStoreReferencePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.DataObjectReference.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DataObjectReferencePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DataObjectReferencePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CallConversation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CallConversationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CallConversationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Conversation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ConversationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ConversationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.SubConversation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new SubConversationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new SubConversationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.GlobalConversation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new GlobalConversationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new GlobalConversationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.PartnerEntity.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new PartnerEntityPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new PartnerEntityPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.PartnerRole.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new PartnerRolePropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new PartnerRolePropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CallChoreography.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CallChoreographyPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CallChoreographyPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.SubChoreography.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new SubChoreographyPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new SubChoreographyPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ChoreographyTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ChoreographyTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ChoreographyTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.GlobalChoreographyTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new GlobalChoreographyTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new GlobalChoreographyTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.TextAnnotation.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new TextAnnotationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new TextAnnotationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Group.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new GroupPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new GroupPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Association.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new AssociationPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new AssociationPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Category.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CategoryPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CategoryPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ServiceTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ServiceTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ServiceTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.SubProcess.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new SubProcessPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new SubProcessPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.MultiInstanceLoopCharacteristics.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new MultiInstanceLoopCharacteristicsPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new MultiInstanceLoopCharacteristicsPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ComplexBehaviorDefinition.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ComplexBehaviorDefinitionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ComplexBehaviorDefinitionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.StandardLoopCharacteristics.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new StandardLoopCharacteristicsPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new StandardLoopCharacteristicsPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.CallActivity.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new CallActivityPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new CallActivityPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.SendTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new SendTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new SendTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ReceiveTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ReceiveTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ReceiveTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.ScriptTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new ScriptTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new ScriptTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.BusinessRuleTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new BusinessRuleTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new BusinessRuleTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.AdHocSubProcess.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new AdHocSubProcessPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new AdHocSubProcessPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Transaction.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new TransactionPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new TransactionPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.GlobalScriptTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new GlobalScriptTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new GlobalScriptTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.GlobalBusinessRuleTask.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new GlobalBusinessRuleTaskPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new GlobalBusinessRuleTaskPropertiesEditionPartForm(component);
		}
		if (key == Bpmn2ViewsRepository.Definitions.class) {
			if (kind == Bpmn2ViewsRepository.SWT_KIND)
				return new DefinitionsPropertiesEditionPartImpl(component);
			if (kind == Bpmn2ViewsRepository.FORM_KIND)
				return new DefinitionsPropertiesEditionPartForm(component);
		}
		return null;
	}

}

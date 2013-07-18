/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts;

/**
 * 
 * 
 */
public class Bpmn2ViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Interface view descriptor
	 * 
	 */
	public static class Interface_ {
		public static class Properties {
	
			
			public static String id = "bpmn2::Interface::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Interface::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Interface::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Interface::properties::documentation";
			
			
			public static String name = "bpmn2::Interface::properties::name";
			
			
			public static String operations = "bpmn2::Interface::properties::operations";
			
			
			public static String implementationRef = "bpmn2::Interface::properties::implementationRef";
			
	
		}
	
	}

	/**
	 * ExtensionDefinition view descriptor
	 * 
	 */
	public static class ExtensionDefinition {
		public static class Properties {
	
			
			public static String name = "bpmn2::ExtensionDefinition::properties::name";
			
	
		}
	
	}

	/**
	 * ExtensionAttributeDefinition view descriptor
	 * 
	 */
	public static class ExtensionAttributeDefinition {
		public static class Properties {
	
			
			public static String name = "bpmn2::ExtensionAttributeDefinition::properties::name";
			
			
			public static String type = "bpmn2::ExtensionAttributeDefinition::properties::type";
			
			
			public static String isReference = "bpmn2::ExtensionAttributeDefinition::properties::isReference";
			
			
			public static String extensionDefinition = "bpmn2::ExtensionAttributeDefinition::properties::extensionDefinition";
			
	
		}
	
	}

	/**
	 * ExtensionAttributeValue view descriptor
	 * 
	 */
	public static class ExtensionAttributeValue {
		public static class Properties {
	
			
			public static String valueRef = "bpmn2::ExtensionAttributeValue::properties::valueRef";
			
			
			public static String extensionAttributeDefinition = "bpmn2::ExtensionAttributeValue::properties::extensionAttributeDefinition";
			
	
		}
	
	}

	/**
	 * Documentation view descriptor
	 * 
	 */
	public static class Documentation {
		public static class Properties {
	
			
			public static String id = "bpmn2::Documentation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Documentation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Documentation::properties::extensionValues";
			
			
			public static String documentation_ = "bpmn2::Documentation::properties::documentation_";
			
			
			public static String text = "bpmn2::Documentation::properties::text";
			
			
			public static String textFormat = "bpmn2::Documentation::properties::textFormat";
			
	
		}
	
	}

	/**
	 * Operation view descriptor
	 * 
	 */
	public static class Operation {
		public static class Properties {
	
			
			public static String id = "bpmn2::Operation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Operation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Operation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Operation::properties::documentation";
			
			
			public static String name = "bpmn2::Operation::properties::name";
			
			
			public static String inMessageRef = "bpmn2::Operation::properties::inMessageRef";
			
			
			public static String outMessageRef = "bpmn2::Operation::properties::outMessageRef";
			
			
			public static String errorRefs = "bpmn2::Operation::properties::errorRefs";
			
			
			public static String implementationRef = "bpmn2::Operation::properties::implementationRef";
			
	
		}
	
	}

	/**
	 * Message view descriptor
	 * 
	 */
	public static class Message {
		public static class Properties {
	
			
			public static String id = "bpmn2::Message::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Message::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Message::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Message::properties::documentation";
			
			
			public static String name = "bpmn2::Message::properties::name";
			
			
			public static String itemRef = "bpmn2::Message::properties::itemRef";
			
	
		}
	
	}

	/**
	 * ItemDefinition view descriptor
	 * 
	 */
	public static class ItemDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::ItemDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ItemDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ItemDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ItemDefinition::properties::documentation";
			
			
			public static String itemKind = "bpmn2::ItemDefinition::properties::itemKind";
			
			
			public static String structureRef = "bpmn2::ItemDefinition::properties::structureRef";
			
			
			public static String isCollection = "bpmn2::ItemDefinition::properties::isCollection";
			
			
			public static String import_ = "bpmn2::ItemDefinition::properties::import";
			
	
		}
	
	}

	/**
	 * Import view descriptor
	 * 
	 */
	public static class Import_ {
		public static class Properties {
	
			
			public static String importType = "bpmn2::Import::properties::importType";
			
			
			public static String location = "bpmn2::Import::properties::location";
			
			
			public static String namespace = "bpmn2::Import::properties::namespace";
			
	
		}
	
	}

	/**
	 * Error view descriptor
	 * 
	 */
	public static class Error {
		public static class Properties {
	
			
			public static String id = "bpmn2::Error::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Error::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Error::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Error::properties::documentation";
			
			
			public static String structureRef = "bpmn2::Error::properties::structureRef";
			
			
			public static String name = "bpmn2::Error::properties::name";
			
			
			public static String errorCode = "bpmn2::Error::properties::errorCode";
			
	
		}
	
	}

	/**
	 * EndPoint view descriptor
	 * 
	 */
	public static class EndPoint {
		public static class Properties {
	
			
			public static String id = "bpmn2::EndPoint::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::EndPoint::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::EndPoint::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::EndPoint::properties::documentation";
			
	
		}
	
	}

	/**
	 * Auditing view descriptor
	 * 
	 */
	public static class Auditing {
		public static class Properties {
	
			
			public static String id = "bpmn2::Auditing::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Auditing::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Auditing::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Auditing::properties::documentation";
			
	
		}
	
	}

	/**
	 * GlobalTask view descriptor
	 * 
	 */
	public static class GlobalTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::GlobalTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::GlobalTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::GlobalTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::GlobalTask::properties::documentation";
			
			
			public static String name = "bpmn2::GlobalTask::properties::name";
			
			
			public static String supportedInterfaceRefs = "bpmn2::GlobalTask::properties::supportedInterfaceRefs";
			
			
			public static String ioBinding = "bpmn2::GlobalTask::properties::ioBinding";
			
			
			public static String resources = "bpmn2::GlobalTask::properties::resources";
			
	
		}
	
	}

	/**
	 * InputOutputSpecification view descriptor
	 * 
	 */
	public static class InputOutputSpecification {
		public static class Properties {
	
			
			public static String id = "bpmn2::InputOutputSpecification::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::InputOutputSpecification::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::InputOutputSpecification::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::InputOutputSpecification::properties::documentation";
			
	
		}
	
	}

	/**
	 * InputSet view descriptor
	 * 
	 */
	public static class InputSet {
		public static class Properties {
	
			
			public static String id = "bpmn2::InputSet::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::InputSet::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::InputSet::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::InputSet::properties::documentation";
			
			
			public static String name = "bpmn2::InputSet::properties::name";
			
			
			public static String dataInputRefs = "bpmn2::InputSet::properties::dataInputRefs";
			
			
			public static String optionalInputRefs = "bpmn2::InputSet::properties::optionalInputRefs";
			
			
			public static String whileExecutingInputRefs = "bpmn2::InputSet::properties::whileExecutingInputRefs";
			
			
			public static String outputSetRefs = "bpmn2::InputSet::properties::outputSetRefs";
			
	
		}
	
	}

	/**
	 * DataInput view descriptor
	 * 
	 */
	public static class DataInput {
		public static class Properties {
	
			
			public static String id = "bpmn2::DataInput::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::DataInput::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::DataInput::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::DataInput::properties::documentation";
			
			
			public static String itemSubjectRef = "bpmn2::DataInput::properties::itemSubjectRef";
			
			
			public static String name = "bpmn2::DataInput::properties::name";
			
			
			public static String isCollection = "bpmn2::DataInput::properties::isCollection";
			
	
		}
	
	}

	/**
	 * ItemAwareElement view descriptor
	 * 
	 */
	public static class ItemAwareElement {
		public static class Properties {
	
			
			public static String id = "bpmn2::ItemAwareElement::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ItemAwareElement::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ItemAwareElement::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ItemAwareElement::properties::documentation";
			
			
			public static String itemSubjectRef = "bpmn2::ItemAwareElement::properties::itemSubjectRef";
			
	
		}
	
	}

	/**
	 * DataState view descriptor
	 * 
	 */
	public static class DataState {
		public static class Properties {
	
			
			public static String id = "bpmn2::DataState::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::DataState::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::DataState::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::DataState::properties::documentation";
			
			
			public static String name = "bpmn2::DataState::properties::name";
			
	
		}
	
	}

	/**
	 * OutputSet view descriptor
	 * 
	 */
	public static class OutputSet {
		public static class Properties {
	
			
			public static String id = "bpmn2::OutputSet::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::OutputSet::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::OutputSet::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::OutputSet::properties::documentation";
			
			
			public static String dataOutputRefs = "bpmn2::OutputSet::properties::dataOutputRefs";
			
			
			public static String optionalOutputRefs = "bpmn2::OutputSet::properties::optionalOutputRefs";
			
			
			public static String name = "bpmn2::OutputSet::properties::name";
			
			
			public static String inputSetRefs = "bpmn2::OutputSet::properties::inputSetRefs";
			
	
		}
	
	}

	/**
	 * DataOutput view descriptor
	 * 
	 */
	public static class DataOutput {
		public static class Properties {
	
			
			public static String id = "bpmn2::DataOutput::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::DataOutput::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::DataOutput::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::DataOutput::properties::documentation";
			
			
			public static String itemSubjectRef = "bpmn2::DataOutput::properties::itemSubjectRef";
			
			
			public static String name = "bpmn2::DataOutput::properties::name";
			
			
			public static String isCollection = "bpmn2::DataOutput::properties::isCollection";
			
	
		}
	
	}

	/**
	 * InputOutputBinding view descriptor
	 * 
	 */
	public static class InputOutputBinding {
		public static class Properties {
	
			
			public static String inputDataRef = "bpmn2::InputOutputBinding::properties::inputDataRef";
			
			
			public static String outputDataRef = "bpmn2::InputOutputBinding::properties::outputDataRef";
			
			
			public static String operationRef = "bpmn2::InputOutputBinding::properties::operationRef";
			
	
		}
	
	}

	/**
	 * ResourceRole view descriptor
	 * 
	 */
	public static class ResourceRole {
		public static class Properties {
	
			
			public static String id = "bpmn2::ResourceRole::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ResourceRole::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ResourceRole::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ResourceRole::properties::documentation";
			
			
			public static String resourceRef = "bpmn2::ResourceRole::properties::resourceRef";
			
			
			public static String resourceParameterBindings = "bpmn2::ResourceRole::properties::resourceParameterBindings";
			
			
			public static String name = "bpmn2::ResourceRole::properties::name";
			
	
		}
	
	}

	/**
	 * Resource view descriptor
	 * 
	 */
	public static class Resource {
		public static class Properties {
	
			
			public static String id = "bpmn2::Resource::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Resource::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Resource::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Resource::properties::documentation";
			
			
			public static String name = "bpmn2::Resource::properties::name";
			
			
			public static String resourceParameters = "bpmn2::Resource::properties::resourceParameters";
			
	
		}
	
	}

	/**
	 * ResourceParameter view descriptor
	 * 
	 */
	public static class ResourceParameter {
		public static class Properties {
	
			
			public static String id = "bpmn2::ResourceParameter::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ResourceParameter::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ResourceParameter::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ResourceParameter::properties::documentation";
			
			
			public static String name = "bpmn2::ResourceParameter::properties::name";
			
			
			public static String isRequired = "bpmn2::ResourceParameter::properties::isRequired";
			
			
			public static String type = "bpmn2::ResourceParameter::properties::type";
			
	
		}
	
	}

	/**
	 * ResourceParameterBinding view descriptor
	 * 
	 */
	public static class ResourceParameterBinding {
		public static class Properties {
	
			
			public static String parameterRef = "bpmn2::ResourceParameterBinding::properties::parameterRef";
			
	
		}
	
	}

	/**
	 * Expression view descriptor
	 * 
	 */
	public static class Expression {
		public static class Properties {
	
			
			public static String id = "bpmn2::Expression::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Expression::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Expression::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Expression::properties::documentation";
			
	
		}
	
	}

	/**
	 * ResourceAssignmentExpression view descriptor
	 * 
	 */
	public static class ResourceAssignmentExpression {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * Monitoring view descriptor
	 * 
	 */
	public static class Monitoring {
		public static class Properties {
	
			
			public static String id = "bpmn2::Monitoring::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Monitoring::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Monitoring::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Monitoring::properties::documentation";
			
	
		}
	
	}

	/**
	 * Performer view descriptor
	 * 
	 */
	public static class Performer {
		public static class Properties {
	
			
			public static String id = "bpmn2::Performer::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Performer::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Performer::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Performer::properties::documentation";
			
			
			public static String resourceRef = "bpmn2::Performer::properties::resourceRef";
			
			
			public static String resourceParameterBindings = "bpmn2::Performer::properties::resourceParameterBindings";
			
			
			public static String name = "bpmn2::Performer::properties::name";
			
	
		}
	
	}

	/**
	 * Process view descriptor
	 * 
	 */
	public static class Process {
		public static class Properties {
	
			
			public static String id = "bpmn2::Process::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Process::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Process::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Process::properties::documentation";
			
			
			public static String name = "bpmn2::Process::properties::name";
			
			
			public static String supportedInterfaceRefs = "bpmn2::Process::properties::supportedInterfaceRefs";
			
			
			public static String ioBinding = "bpmn2::Process::properties::ioBinding";
			
			
			public static String laneSets = "bpmn2::Process::properties::laneSets";
			
			
			public static String processType = "bpmn2::Process::properties::processType";
			
			
			public static String isClosed = "bpmn2::Process::properties::isClosed";
			
			
			public static String properties_ = "bpmn2::Process::properties::properties_";
			
			
			public static String supports = "bpmn2::Process::properties::supports";
			
			
			public static String definitionalCollaborationRef = "bpmn2::Process::properties::definitionalCollaborationRef";
			
			
			public static String isExecutable = "bpmn2::Process::properties::isExecutable";
			
			
			public static String resources = "bpmn2::Process::properties::resources";
			
			
			public static String artifacts = "bpmn2::Process::properties::artifacts";
			
			
			public static String correlationSubscriptions = "bpmn2::Process::properties::correlationSubscriptions";
			
	
		}
	
	}

	/**
	 * CategoryValue view descriptor
	 * 
	 */
	public static class CategoryValue {
		public static class Properties {
	
			
			public static String id = "bpmn2::CategoryValue::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CategoryValue::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CategoryValue::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CategoryValue::properties::documentation";
			
			
			public static String value = "bpmn2::CategoryValue::properties::value";
			
	
		}
	
	}

	/**
	 * LaneSet view descriptor
	 * 
	 */
	public static class LaneSet {
		public static class Properties {
	
			
			public static String id = "bpmn2::LaneSet::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::LaneSet::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::LaneSet::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::LaneSet::properties::documentation";
			
			
			public static String name = "bpmn2::LaneSet::properties::name";
			
	
		}
	
	}

	/**
	 * Lane view descriptor
	 * 
	 */
	public static class Lane {
		public static class Properties {
	
			
			public static String id = "bpmn2::Lane::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Lane::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Lane::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Lane::properties::documentation";
			
			
			public static String name = "bpmn2::Lane::properties::name";
			
			
			public static String partitionElementRef = "bpmn2::Lane::properties::partitionElementRef";
			
			
			public static String flowNodeRefs = "bpmn2::Lane::properties::flowNodeRefs";
			
	
		}
	
	}

	/**
	 * SequenceFlow view descriptor
	 * 
	 */
	public static class SequenceFlow {
		public static class Properties {
	
			
			public static String id = "bpmn2::SequenceFlow::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::SequenceFlow::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::SequenceFlow::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::SequenceFlow::properties::documentation";
			
			
			public static String name = "bpmn2::SequenceFlow::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::SequenceFlow::properties::categoryValueRef";
			
			
			public static String isImmediate = "bpmn2::SequenceFlow::properties::isImmediate";
			
			
			public static String targetRef = "bpmn2::SequenceFlow::properties::targetRef";
			
			
			public static String sourceRef = "bpmn2::SequenceFlow::properties::sourceRef";
			
	
		}
	
	}

	/**
	 * Property view descriptor
	 * 
	 */
	public static class Property {
		public static class Properties {
	
			
			public static String id = "bpmn2::Property::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Property::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Property::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Property::properties::documentation";
			
			
			public static String itemSubjectRef = "bpmn2::Property::properties::itemSubjectRef";
			
			
			public static String name = "bpmn2::Property::properties::name";
			
	
		}
	
	}

	/**
	 * Collaboration view descriptor
	 * 
	 */
	public static class Collaboration {
		public static class Properties {
	
			
			public static String id = "bpmn2::Collaboration::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Collaboration::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Collaboration::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Collaboration::properties::documentation";
			
			
			public static String name = "bpmn2::Collaboration::properties::name";
			
			
			public static String isClosed = "bpmn2::Collaboration::properties::isClosed";
			
			
			public static String choreographyRef = "bpmn2::Collaboration::properties::choreographyRef";
			
			
			public static String artifacts = "bpmn2::Collaboration::properties::artifacts";
			
			
			public static String participantAssociations = "bpmn2::Collaboration::properties::participantAssociations";
			
			
			public static String messageFlowAssociations = "bpmn2::Collaboration::properties::messageFlowAssociations";
			
			
			public static String messageFlows = "bpmn2::Collaboration::properties::messageFlows";
			
			
			public static String correlationKeys = "bpmn2::Collaboration::properties::correlationKeys";
			
	
		}
	
	}

	/**
	 * Choreography view descriptor
	 * 
	 */
	public static class Choreography {
		public static class Properties {
	
			
			public static String id = "bpmn2::Choreography::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Choreography::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Choreography::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Choreography::properties::documentation";
			
			
			public static String name = "bpmn2::Choreography::properties::name";
			
			
			public static String isClosed = "bpmn2::Choreography::properties::isClosed";
			
			
			public static String choreographyRef = "bpmn2::Choreography::properties::choreographyRef";
			
			
			public static String artifacts = "bpmn2::Choreography::properties::artifacts";
			
			
			public static String participantAssociations = "bpmn2::Choreography::properties::participantAssociations";
			
			
			public static String messageFlowAssociations = "bpmn2::Choreography::properties::messageFlowAssociations";
			
			
			public static String messageFlows = "bpmn2::Choreography::properties::messageFlows";
			
			
			public static String correlationKeys = "bpmn2::Choreography::properties::correlationKeys";
			
			
			public static String laneSets = "bpmn2::Choreography::properties::laneSets";
			
	
		}
	
	}

	/**
	 * ParticipantAssociation view descriptor
	 * 
	 */
	public static class ParticipantAssociation {
		public static class Properties {
	
			
			public static String id = "bpmn2::ParticipantAssociation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ParticipantAssociation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ParticipantAssociation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ParticipantAssociation::properties::documentation";
			
			
			public static String innerParticipantRef = "bpmn2::ParticipantAssociation::properties::innerParticipantRef";
			
			
			public static String outerParticipantRef = "bpmn2::ParticipantAssociation::properties::outerParticipantRef";
			
	
		}
	
	}

	/**
	 * Participant view descriptor
	 * 
	 */
	public static class Participant {
		public static class Properties {
	
			
			public static String id = "bpmn2::Participant::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Participant::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Participant::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Participant::properties::documentation";
			
			
			public static String name = "bpmn2::Participant::properties::name";
			
			
			public static String interfaceRefs = "bpmn2::Participant::properties::interfaceRefs";
			
			
			public static String endPointRefs = "bpmn2::Participant::properties::endPointRefs";
			
			
			public static String processRef = "bpmn2::Participant::properties::processRef";
			
	
		}
	
	}

	/**
	 * ConversationLink view descriptor
	 * 
	 */
	public static class ConversationLink {
		public static class Properties {
	
			
			public static String id = "bpmn2::ConversationLink::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ConversationLink::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ConversationLink::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ConversationLink::properties::documentation";
			
			
			public static String sourceRef = "bpmn2::ConversationLink::properties::sourceRef";
			
			
			public static String name = "bpmn2::ConversationLink::properties::name";
			
			
			public static String targetRef = "bpmn2::ConversationLink::properties::targetRef";
			
	
		}
	
	}

	/**
	 * ParticipantMultiplicity view descriptor
	 * 
	 */
	public static class ParticipantMultiplicity {
		public static class Properties {
	
			
			public static String minimum = "bpmn2::ParticipantMultiplicity::properties::minimum";
			
			
			public static String maximum = "bpmn2::ParticipantMultiplicity::properties::maximum";
			
	
		}
	
	}

	/**
	 * MessageFlowAssociation view descriptor
	 * 
	 */
	public static class MessageFlowAssociation {
		public static class Properties {
	
			
			public static String id = "bpmn2::MessageFlowAssociation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::MessageFlowAssociation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::MessageFlowAssociation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::MessageFlowAssociation::properties::documentation";
			
			
			public static String innerMessageFlowRef = "bpmn2::MessageFlowAssociation::properties::innerMessageFlowRef";
			
			
			public static String outerMessageFlowRef = "bpmn2::MessageFlowAssociation::properties::outerMessageFlowRef";
			
	
		}
	
	}

	/**
	 * MessageFlow view descriptor
	 * 
	 */
	public static class MessageFlow {
		public static class Properties {
	
			
			public static String id = "bpmn2::MessageFlow::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::MessageFlow::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::MessageFlow::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::MessageFlow::properties::documentation";
			
			
			public static String name = "bpmn2::MessageFlow::properties::name";
			
			
			public static String sourceRef = "bpmn2::MessageFlow::properties::sourceRef";
			
			
			public static String targetRef = "bpmn2::MessageFlow::properties::targetRef";
			
			
			public static String messageRef = "bpmn2::MessageFlow::properties::messageRef";
			
	
		}
	
	}

	/**
	 * ConversationAssociation view descriptor
	 * 
	 */
	public static class ConversationAssociation {
		public static class Properties {
	
			
			public static String id = "bpmn2::ConversationAssociation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ConversationAssociation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ConversationAssociation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ConversationAssociation::properties::documentation";
			
			
			public static String innerConversationNodeRef = "bpmn2::ConversationAssociation::properties::innerConversationNodeRef";
			
			
			public static String outerConversationNodeRef = "bpmn2::ConversationAssociation::properties::outerConversationNodeRef";
			
	
		}
	
	}

	/**
	 * CorrelationKey view descriptor
	 * 
	 */
	public static class CorrelationKey {
		public static class Properties {
	
			
			public static String id = "bpmn2::CorrelationKey::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CorrelationKey::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CorrelationKey::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CorrelationKey::properties::documentation";
			
			
			public static String correlationPropertyRef = "bpmn2::CorrelationKey::properties::correlationPropertyRef";
			
			
			public static String name = "bpmn2::CorrelationKey::properties::name";
			
	
		}
	
	}

	/**
	 * CorrelationProperty view descriptor
	 * 
	 */
	public static class CorrelationProperty {
		public static class Properties {
	
			
			public static String id = "bpmn2::CorrelationProperty::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CorrelationProperty::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CorrelationProperty::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CorrelationProperty::properties::documentation";
			
			
			public static String correlationPropertyRetrievalExpression = "bpmn2::CorrelationProperty::properties::correlationPropertyRetrievalExpression";
			
			
			public static String name = "bpmn2::CorrelationProperty::properties::name";
			
			
			public static String type = "bpmn2::CorrelationProperty::properties::type";
			
	
		}
	
	}

	/**
	 * CorrelationPropertyRetrievalExpression view descriptor
	 * 
	 */
	public static class CorrelationPropertyRetrievalExpression {
		public static class Properties {
	
			
			public static String id = "bpmn2::CorrelationPropertyRetrievalExpression::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CorrelationPropertyRetrievalExpression::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CorrelationPropertyRetrievalExpression::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CorrelationPropertyRetrievalExpression::properties::documentation";
			
			
			public static String messageRef = "bpmn2::CorrelationPropertyRetrievalExpression::properties::messageRef";
			
	
		}
	
	}

	/**
	 * FormalExpression view descriptor
	 * 
	 */
	public static class FormalExpression {
		public static class Properties {
	
			
			public static String id = "bpmn2::FormalExpression::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::FormalExpression::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::FormalExpression::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::FormalExpression::properties::documentation";
			
			
			public static String language = "bpmn2::FormalExpression::properties::language";
			
			
			public static String body = "bpmn2::FormalExpression::properties::body";
			
			
			public static String evaluatesToTypeRef = "bpmn2::FormalExpression::properties::evaluatesToTypeRef";
			
	
		}
	
	}

	/**
	 * CorrelationSubscription view descriptor
	 * 
	 */
	public static class CorrelationSubscription {
		public static class Properties {
	
			
			public static String id = "bpmn2::CorrelationSubscription::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CorrelationSubscription::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CorrelationSubscription::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CorrelationSubscription::properties::documentation";
			
			
			public static String correlationKeyRef = "bpmn2::CorrelationSubscription::properties::correlationKeyRef";
			
			
			public static String correlationPropertyBinding = "bpmn2::CorrelationSubscription::properties::correlationPropertyBinding";
			
	
		}
	
	}

	/**
	 * CorrelationPropertyBinding view descriptor
	 * 
	 */
	public static class CorrelationPropertyBinding {
		public static class Properties {
	
			
			public static String id = "bpmn2::CorrelationPropertyBinding::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CorrelationPropertyBinding::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CorrelationPropertyBinding::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CorrelationPropertyBinding::properties::documentation";
			
			
			public static String correlationPropertyRef = "bpmn2::CorrelationPropertyBinding::properties::correlationPropertyRef";
			
	
		}
	
	}

	/**
	 * GlobalManualTask view descriptor
	 * 
	 */
	public static class GlobalManualTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::GlobalManualTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::GlobalManualTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::GlobalManualTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::GlobalManualTask::properties::documentation";
			
			
			public static String name = "bpmn2::GlobalManualTask::properties::name";
			
			
			public static String supportedInterfaceRefs = "bpmn2::GlobalManualTask::properties::supportedInterfaceRefs";
			
			
			public static String ioBinding = "bpmn2::GlobalManualTask::properties::ioBinding";
			
			
			public static String resources = "bpmn2::GlobalManualTask::properties::resources";
			
	
		}
	
	}

	/**
	 * ManualTask view descriptor
	 * 
	 */
	public static class ManualTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::ManualTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ManualTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ManualTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ManualTask::properties::documentation";
			
			
			public static String name = "bpmn2::ManualTask::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::ManualTask::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::ManualTask::properties::outgoing";
			
			
			public static String incoming = "bpmn2::ManualTask::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::ManualTask::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::ManualTask::properties::resources";
			
			
			public static String default_ = "bpmn2::ManualTask::properties::default";
			
			
			public static String properties_ = "bpmn2::ManualTask::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::ManualTask::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::ManualTask::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::ManualTask::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::ManualTask::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::ManualTask::properties::completionQuantity";
			
	
		}
	
	}

	/**
	 * Task view descriptor
	 * 
	 */
	public static class Task {
		public static class Properties {
	
			
			public static String id = "bpmn2::Task::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Task::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Task::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Task::properties::documentation";
			
			
			public static String name = "bpmn2::Task::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::Task::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::Task::properties::outgoing";
			
			
			public static String incoming = "bpmn2::Task::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::Task::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::Task::properties::resources";
			
			
			public static String default_ = "bpmn2::Task::properties::default";
			
			
			public static String properties_ = "bpmn2::Task::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::Task::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::Task::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::Task::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::Task::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::Task::properties::completionQuantity";
			
	
		}
	
	}

	/**
	 * BoundaryEvent view descriptor
	 * 
	 */
	public static class BoundaryEvent {
		public static class Properties {
	
			
			public static String id = "bpmn2::BoundaryEvent::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::BoundaryEvent::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::BoundaryEvent::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::BoundaryEvent::properties::documentation";
			
			
			public static String name = "bpmn2::BoundaryEvent::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::BoundaryEvent::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::BoundaryEvent::properties::outgoing";
			
			
			public static String incoming = "bpmn2::BoundaryEvent::properties::incoming";
			
			
			public static String properties_ = "bpmn2::BoundaryEvent::properties::properties_";
			
			
			public static String parallelMultiple = "bpmn2::BoundaryEvent::properties::parallelMultiple";
			
			
			public static String eventDefinitionRefs = "bpmn2::BoundaryEvent::properties::eventDefinitionRefs";
			
			
			public static String dataOutputAssociation = "bpmn2::BoundaryEvent::properties::dataOutputAssociation";
			
			
			public static String eventDefinitions = "bpmn2::BoundaryEvent::properties::eventDefinitions";
			
			
			public static String cancelActivity = "bpmn2::BoundaryEvent::properties::cancelActivity";
			
			
			public static String attachedToRef = "bpmn2::BoundaryEvent::properties::attachedToRef";
			
	
		}
	
	}

	/**
	 * DataOutputAssociation view descriptor
	 * 
	 */
	public static class DataOutputAssociation {
		public static class Properties {
	
			
			public static String id = "bpmn2::DataOutputAssociation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::DataOutputAssociation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::DataOutputAssociation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::DataOutputAssociation::properties::documentation";
			
			
			public static String assignment = "bpmn2::DataOutputAssociation::properties::assignment";
			
			
			public static String targetRef = "bpmn2::DataOutputAssociation::properties::targetRef";
			
			
			public static String sourceRef = "bpmn2::DataOutputAssociation::properties::sourceRef";
			
	
		}
	
	}

	/**
	 * DataAssociation view descriptor
	 * 
	 */
	public static class DataAssociation {
		public static class Properties {
	
			
			public static String id = "bpmn2::DataAssociation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::DataAssociation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::DataAssociation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::DataAssociation::properties::documentation";
			
			
			public static String assignment = "bpmn2::DataAssociation::properties::assignment";
			
			
			public static String targetRef = "bpmn2::DataAssociation::properties::targetRef";
			
			
			public static String sourceRef = "bpmn2::DataAssociation::properties::sourceRef";
			
	
		}
	
	}

	/**
	 * Assignment view descriptor
	 * 
	 */
	public static class Assignment {
		public static class Properties {
	
			
			public static String id = "bpmn2::Assignment::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Assignment::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Assignment::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Assignment::properties::documentation";
			
	
		}
	
	}

	/**
	 * DataInputAssociation view descriptor
	 * 
	 */
	public static class DataInputAssociation {
		public static class Properties {
	
			
			public static String id = "bpmn2::DataInputAssociation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::DataInputAssociation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::DataInputAssociation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::DataInputAssociation::properties::documentation";
			
			
			public static String assignment = "bpmn2::DataInputAssociation::properties::assignment";
			
			
			public static String targetRef = "bpmn2::DataInputAssociation::properties::targetRef";
			
			
			public static String sourceRef = "bpmn2::DataInputAssociation::properties::sourceRef";
			
	
		}
	
	}

	/**
	 * UserTask view descriptor
	 * 
	 */
	public static class UserTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::UserTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::UserTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::UserTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::UserTask::properties::documentation";
			
			
			public static String name = "bpmn2::UserTask::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::UserTask::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::UserTask::properties::outgoing";
			
			
			public static String incoming = "bpmn2::UserTask::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::UserTask::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::UserTask::properties::resources";
			
			
			public static String default_ = "bpmn2::UserTask::properties::default";
			
			
			public static String properties_ = "bpmn2::UserTask::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::UserTask::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::UserTask::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::UserTask::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::UserTask::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::UserTask::properties::completionQuantity";
			
			
			public static String renderings = "bpmn2::UserTask::properties::renderings";
			
			
			public static String implementation = "bpmn2::UserTask::properties::implementation";
			
	
		}
	
	}

	/**
	 * Rendering view descriptor
	 * 
	 */
	public static class Rendering {
		public static class Properties {
	
			
			public static String id = "bpmn2::Rendering::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Rendering::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Rendering::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Rendering::properties::documentation";
			
	
		}
	
	}

	/**
	 * HumanPerformer view descriptor
	 * 
	 */
	public static class HumanPerformer {
		public static class Properties {
	
			
			public static String id = "bpmn2::HumanPerformer::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::HumanPerformer::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::HumanPerformer::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::HumanPerformer::properties::documentation";
			
			
			public static String resourceRef = "bpmn2::HumanPerformer::properties::resourceRef";
			
			
			public static String resourceParameterBindings = "bpmn2::HumanPerformer::properties::resourceParameterBindings";
			
			
			public static String name = "bpmn2::HumanPerformer::properties::name";
			
	
		}
	
	}

	/**
	 * PotentialOwner view descriptor
	 * 
	 */
	public static class PotentialOwner {
		public static class Properties {
	
			
			public static String id = "bpmn2::PotentialOwner::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::PotentialOwner::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::PotentialOwner::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::PotentialOwner::properties::documentation";
			
			
			public static String resourceRef = "bpmn2::PotentialOwner::properties::resourceRef";
			
			
			public static String resourceParameterBindings = "bpmn2::PotentialOwner::properties::resourceParameterBindings";
			
			
			public static String name = "bpmn2::PotentialOwner::properties::name";
			
	
		}
	
	}

	/**
	 * GlobalUserTask view descriptor
	 * 
	 */
	public static class GlobalUserTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::GlobalUserTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::GlobalUserTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::GlobalUserTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::GlobalUserTask::properties::documentation";
			
			
			public static String name = "bpmn2::GlobalUserTask::properties::name";
			
			
			public static String supportedInterfaceRefs = "bpmn2::GlobalUserTask::properties::supportedInterfaceRefs";
			
			
			public static String ioBinding = "bpmn2::GlobalUserTask::properties::ioBinding";
			
			
			public static String resources = "bpmn2::GlobalUserTask::properties::resources";
			
			
			public static String implementation = "bpmn2::GlobalUserTask::properties::implementation";
			
			
			public static String renderings = "bpmn2::GlobalUserTask::properties::renderings";
			
	
		}
	
	}

	/**
	 * EventBasedGateway view descriptor
	 * 
	 */
	public static class EventBasedGateway {
		public static class Properties {
	
			
			public static String id = "bpmn2::EventBasedGateway::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::EventBasedGateway::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::EventBasedGateway::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::EventBasedGateway::properties::documentation";
			
			
			public static String name = "bpmn2::EventBasedGateway::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::EventBasedGateway::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::EventBasedGateway::properties::outgoing";
			
			
			public static String incoming = "bpmn2::EventBasedGateway::properties::incoming";
			
			
			public static String gatewayDirection = "bpmn2::EventBasedGateway::properties::gatewayDirection";
			
			
			public static String instantiate = "bpmn2::EventBasedGateway::properties::instantiate";
			
			
			public static String eventGatewayType = "bpmn2::EventBasedGateway::properties::eventGatewayType";
			
	
		}
	
	}

	/**
	 * ComplexGateway view descriptor
	 * 
	 */
	public static class ComplexGateway {
		public static class Properties {
	
			
			public static String id = "bpmn2::ComplexGateway::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ComplexGateway::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ComplexGateway::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ComplexGateway::properties::documentation";
			
			
			public static String name = "bpmn2::ComplexGateway::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::ComplexGateway::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::ComplexGateway::properties::outgoing";
			
			
			public static String incoming = "bpmn2::ComplexGateway::properties::incoming";
			
			
			public static String gatewayDirection = "bpmn2::ComplexGateway::properties::gatewayDirection";
			
			
			public static String default_ = "bpmn2::ComplexGateway::properties::default";
			
	
		}
	
	}

	/**
	 * ExclusiveGateway view descriptor
	 * 
	 */
	public static class ExclusiveGateway {
		public static class Properties {
	
			
			public static String id = "bpmn2::ExclusiveGateway::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ExclusiveGateway::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ExclusiveGateway::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ExclusiveGateway::properties::documentation";
			
			
			public static String name = "bpmn2::ExclusiveGateway::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::ExclusiveGateway::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::ExclusiveGateway::properties::outgoing";
			
			
			public static String incoming = "bpmn2::ExclusiveGateway::properties::incoming";
			
			
			public static String gatewayDirection = "bpmn2::ExclusiveGateway::properties::gatewayDirection";
			
			
			public static String default_ = "bpmn2::ExclusiveGateway::properties::default";
			
	
		}
	
	}

	/**
	 * InclusiveGateway view descriptor
	 * 
	 */
	public static class InclusiveGateway {
		public static class Properties {
	
			
			public static String id = "bpmn2::InclusiveGateway::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::InclusiveGateway::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::InclusiveGateway::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::InclusiveGateway::properties::documentation";
			
			
			public static String name = "bpmn2::InclusiveGateway::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::InclusiveGateway::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::InclusiveGateway::properties::outgoing";
			
			
			public static String incoming = "bpmn2::InclusiveGateway::properties::incoming";
			
			
			public static String gatewayDirection = "bpmn2::InclusiveGateway::properties::gatewayDirection";
			
			
			public static String default_ = "bpmn2::InclusiveGateway::properties::default";
			
	
		}
	
	}

	/**
	 * ParallelGateway view descriptor
	 * 
	 */
	public static class ParallelGateway {
		public static class Properties {
	
			
			public static String id = "bpmn2::ParallelGateway::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ParallelGateway::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ParallelGateway::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ParallelGateway::properties::documentation";
			
			
			public static String name = "bpmn2::ParallelGateway::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::ParallelGateway::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::ParallelGateway::properties::outgoing";
			
			
			public static String incoming = "bpmn2::ParallelGateway::properties::incoming";
			
			
			public static String gatewayDirection = "bpmn2::ParallelGateway::properties::gatewayDirection";
			
	
		}
	
	}

	/**
	 * Relationship view descriptor
	 * 
	 */
	public static class Relationship {
		public static class Properties {
	
			
			public static String id = "bpmn2::Relationship::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Relationship::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Relationship::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Relationship::properties::documentation";
			
			
			public static String type = "bpmn2::Relationship::properties::type";
			
			
			public static String direction = "bpmn2::Relationship::properties::direction";
			
			
			public static String sources = "bpmn2::Relationship::properties::sources";
			
			
			public static String targets = "bpmn2::Relationship::properties::targets";
			
	
		}
	
	}

	/**
	 * Extension view descriptor
	 * 
	 */
	public static class Extension {
		public static class Properties {
	
			
			public static String mustUnderstand = "bpmn2::Extension::properties::mustUnderstand";
			
	
		}
	
	}

	/**
	 * IntermediateCatchEvent view descriptor
	 * 
	 */
	public static class IntermediateCatchEvent {
		public static class Properties {
	
			
			public static String id = "bpmn2::IntermediateCatchEvent::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::IntermediateCatchEvent::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::IntermediateCatchEvent::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::IntermediateCatchEvent::properties::documentation";
			
			
			public static String name = "bpmn2::IntermediateCatchEvent::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::IntermediateCatchEvent::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::IntermediateCatchEvent::properties::outgoing";
			
			
			public static String incoming = "bpmn2::IntermediateCatchEvent::properties::incoming";
			
			
			public static String properties_ = "bpmn2::IntermediateCatchEvent::properties::properties_";
			
			
			public static String parallelMultiple = "bpmn2::IntermediateCatchEvent::properties::parallelMultiple";
			
			
			public static String eventDefinitionRefs = "bpmn2::IntermediateCatchEvent::properties::eventDefinitionRefs";
			
			
			public static String dataOutputAssociation = "bpmn2::IntermediateCatchEvent::properties::dataOutputAssociation";
			
			
			public static String eventDefinitions = "bpmn2::IntermediateCatchEvent::properties::eventDefinitions";
			
	
		}
	
	}

	/**
	 * IntermediateThrowEvent view descriptor
	 * 
	 */
	public static class IntermediateThrowEvent {
		public static class Properties {
	
			
			public static String id = "bpmn2::IntermediateThrowEvent::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::IntermediateThrowEvent::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::IntermediateThrowEvent::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::IntermediateThrowEvent::properties::documentation";
			
			
			public static String name = "bpmn2::IntermediateThrowEvent::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::IntermediateThrowEvent::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::IntermediateThrowEvent::properties::outgoing";
			
			
			public static String incoming = "bpmn2::IntermediateThrowEvent::properties::incoming";
			
			
			public static String properties_ = "bpmn2::IntermediateThrowEvent::properties::properties_";
			
			
			public static String eventDefinitionRefs = "bpmn2::IntermediateThrowEvent::properties::eventDefinitionRefs";
			
			
			public static String dataInputAssociation = "bpmn2::IntermediateThrowEvent::properties::dataInputAssociation";
			
			
			public static String eventDefinitions = "bpmn2::IntermediateThrowEvent::properties::eventDefinitions";
			
	
		}
	
	}

	/**
	 * EndEvent view descriptor
	 * 
	 */
	public static class EndEvent {
		public static class Properties {
	
			
			public static String id = "bpmn2::EndEvent::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::EndEvent::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::EndEvent::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::EndEvent::properties::documentation";
			
			
			public static String name = "bpmn2::EndEvent::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::EndEvent::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::EndEvent::properties::outgoing";
			
			
			public static String incoming = "bpmn2::EndEvent::properties::incoming";
			
			
			public static String properties_ = "bpmn2::EndEvent::properties::properties_";
			
			
			public static String eventDefinitionRefs = "bpmn2::EndEvent::properties::eventDefinitionRefs";
			
			
			public static String dataInputAssociation = "bpmn2::EndEvent::properties::dataInputAssociation";
			
			
			public static String eventDefinitions = "bpmn2::EndEvent::properties::eventDefinitions";
			
	
		}
	
	}

	/**
	 * StartEvent view descriptor
	 * 
	 */
	public static class StartEvent {
		public static class Properties {
	
			
			public static String id = "bpmn2::StartEvent::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::StartEvent::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::StartEvent::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::StartEvent::properties::documentation";
			
			
			public static String name = "bpmn2::StartEvent::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::StartEvent::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::StartEvent::properties::outgoing";
			
			
			public static String incoming = "bpmn2::StartEvent::properties::incoming";
			
			
			public static String properties_ = "bpmn2::StartEvent::properties::properties_";
			
			
			public static String parallelMultiple = "bpmn2::StartEvent::properties::parallelMultiple";
			
			
			public static String eventDefinitionRefs = "bpmn2::StartEvent::properties::eventDefinitionRefs";
			
			
			public static String dataOutputAssociation = "bpmn2::StartEvent::properties::dataOutputAssociation";
			
			
			public static String eventDefinitions = "bpmn2::StartEvent::properties::eventDefinitions";
			
			
			public static String isInterrupting = "bpmn2::StartEvent::properties::isInterrupting";
			
	
		}
	
	}

	/**
	 * CancelEventDefinition view descriptor
	 * 
	 */
	public static class CancelEventDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::CancelEventDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CancelEventDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CancelEventDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CancelEventDefinition::properties::documentation";
			
	
		}
	
	}

	/**
	 * ErrorEventDefinition view descriptor
	 * 
	 */
	public static class ErrorEventDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::ErrorEventDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ErrorEventDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ErrorEventDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ErrorEventDefinition::properties::documentation";
			
			
			public static String errorRef = "bpmn2::ErrorEventDefinition::properties::errorRef";
			
	
		}
	
	}

	/**
	 * TerminateEventDefinition view descriptor
	 * 
	 */
	public static class TerminateEventDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::TerminateEventDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::TerminateEventDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::TerminateEventDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::TerminateEventDefinition::properties::documentation";
			
	
		}
	
	}

	/**
	 * EscalationEventDefinition view descriptor
	 * 
	 */
	public static class EscalationEventDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::EscalationEventDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::EscalationEventDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::EscalationEventDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::EscalationEventDefinition::properties::documentation";
			
			
			public static String escalationRef = "bpmn2::EscalationEventDefinition::properties::escalationRef";
			
	
		}
	
	}

	/**
	 * Escalation view descriptor
	 * 
	 */
	public static class Escalation {
		public static class Properties {
	
			
			public static String structureRef = "bpmn2::Escalation::properties::structureRef";
			
			
			public static String name = "bpmn2::Escalation::properties::name";
			
			
			public static String escalationCode = "bpmn2::Escalation::properties::escalationCode";
			
	
		}
	
	}

	/**
	 * CompensateEventDefinition view descriptor
	 * 
	 */
	public static class CompensateEventDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::CompensateEventDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CompensateEventDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CompensateEventDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CompensateEventDefinition::properties::documentation";
			
			
			public static String waitForCompletion = "bpmn2::CompensateEventDefinition::properties::waitForCompletion";
			
			
			public static String activityRef = "bpmn2::CompensateEventDefinition::properties::activityRef";
			
	
		}
	
	}

	/**
	 * TimerEventDefinition view descriptor
	 * 
	 */
	public static class TimerEventDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::TimerEventDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::TimerEventDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::TimerEventDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::TimerEventDefinition::properties::documentation";
			
	
		}
	
	}

	/**
	 * LinkEventDefinition view descriptor
	 * 
	 */
	public static class LinkEventDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::LinkEventDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::LinkEventDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::LinkEventDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::LinkEventDefinition::properties::documentation";
			
			
			public static String name = "bpmn2::LinkEventDefinition::properties::name";
			
			
			public static String target = "bpmn2::LinkEventDefinition::properties::target";
			
			
			public static String source = "bpmn2::LinkEventDefinition::properties::source";
			
	
		}
	
	}

	/**
	 * MessageEventDefinition view descriptor
	 * 
	 */
	public static class MessageEventDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::MessageEventDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::MessageEventDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::MessageEventDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::MessageEventDefinition::properties::documentation";
			
			
			public static String messageRef = "bpmn2::MessageEventDefinition::properties::messageRef";
			
			
			public static String operationRef = "bpmn2::MessageEventDefinition::properties::operationRef";
			
	
		}
	
	}

	/**
	 * ConditionalEventDefinition view descriptor
	 * 
	 */
	public static class ConditionalEventDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::ConditionalEventDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ConditionalEventDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ConditionalEventDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ConditionalEventDefinition::properties::documentation";
			
	
		}
	
	}

	/**
	 * SignalEventDefinition view descriptor
	 * 
	 */
	public static class SignalEventDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::SignalEventDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::SignalEventDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::SignalEventDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::SignalEventDefinition::properties::documentation";
			
			
			public static String signalRef = "bpmn2::SignalEventDefinition::properties::signalRef";
			
	
		}
	
	}

	/**
	 * Signal view descriptor
	 * 
	 */
	public static class Signal {
		public static class Properties {
	
			
			public static String id = "bpmn2::Signal::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Signal::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Signal::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Signal::properties::documentation";
			
			
			public static String structureRef = "bpmn2::Signal::properties::structureRef";
			
			
			public static String name = "bpmn2::Signal::properties::name";
			
	
		}
	
	}

	/**
	 * ImplicitThrowEvent view descriptor
	 * 
	 */
	public static class ImplicitThrowEvent {
		public static class Properties {
	
			
			public static String id = "bpmn2::ImplicitThrowEvent::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ImplicitThrowEvent::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ImplicitThrowEvent::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ImplicitThrowEvent::properties::documentation";
			
			
			public static String name = "bpmn2::ImplicitThrowEvent::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::ImplicitThrowEvent::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::ImplicitThrowEvent::properties::outgoing";
			
			
			public static String incoming = "bpmn2::ImplicitThrowEvent::properties::incoming";
			
			
			public static String properties_ = "bpmn2::ImplicitThrowEvent::properties::properties_";
			
			
			public static String eventDefinitionRefs = "bpmn2::ImplicitThrowEvent::properties::eventDefinitionRefs";
			
			
			public static String dataInputAssociation = "bpmn2::ImplicitThrowEvent::properties::dataInputAssociation";
			
			
			public static String eventDefinitions = "bpmn2::ImplicitThrowEvent::properties::eventDefinitions";
			
	
		}
	
	}

	/**
	 * DataObject view descriptor
	 * 
	 */
	public static class DataObject {
		public static class Properties {
	
			
			public static String id = "bpmn2::DataObject::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::DataObject::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::DataObject::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::DataObject::properties::documentation";
			
			
			public static String name = "bpmn2::DataObject::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::DataObject::properties::categoryValueRef";
			
			
			public static String itemSubjectRef = "bpmn2::DataObject::properties::itemSubjectRef";
			
			
			public static String isCollection = "bpmn2::DataObject::properties::isCollection";
			
	
		}
	
	}

	/**
	 * DataStore view descriptor
	 * 
	 */
	public static class DataStore {
		public static class Properties {
	
			
			public static String id = "bpmn2::DataStore::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::DataStore::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::DataStore::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::DataStore::properties::documentation";
			
			
			public static String itemSubjectRef = "bpmn2::DataStore::properties::itemSubjectRef";
			
			
			public static String name = "bpmn2::DataStore::properties::name";
			
			
			public static String capacity = "bpmn2::DataStore::properties::capacity";
			
			
			public static String isUnlimited = "bpmn2::DataStore::properties::isUnlimited";
			
	
		}
	
	}

	/**
	 * DataStoreReference view descriptor
	 * 
	 */
	public static class DataStoreReference {
		public static class Properties {
	
			
			public static String id = "bpmn2::DataStoreReference::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::DataStoreReference::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::DataStoreReference::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::DataStoreReference::properties::documentation";
			
			
			public static String name = "bpmn2::DataStoreReference::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::DataStoreReference::properties::categoryValueRef";
			
			
			public static String itemSubjectRef = "bpmn2::DataStoreReference::properties::itemSubjectRef";
			
			
			public static String dataStoreRef = "bpmn2::DataStoreReference::properties::dataStoreRef";
			
	
		}
	
	}

	/**
	 * DataObjectReference view descriptor
	 * 
	 */
	public static class DataObjectReference {
		public static class Properties {
	
			
			public static String id = "bpmn2::DataObjectReference::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::DataObjectReference::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::DataObjectReference::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::DataObjectReference::properties::documentation";
			
			
			public static String name = "bpmn2::DataObjectReference::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::DataObjectReference::properties::categoryValueRef";
			
			
			public static String itemSubjectRef = "bpmn2::DataObjectReference::properties::itemSubjectRef";
			
			
			public static String dataObjectRef = "bpmn2::DataObjectReference::properties::dataObjectRef";
			
	
		}
	
	}

	/**
	 * CallConversation view descriptor
	 * 
	 */
	public static class CallConversation {
		public static class Properties {
	
			
			public static String id = "bpmn2::CallConversation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CallConversation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CallConversation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CallConversation::properties::documentation";
			
			
			public static String name = "bpmn2::CallConversation::properties::name";
			
			
			public static String participantRefs = "bpmn2::CallConversation::properties::participantRefs";
			
			
			public static String messageFlowRefs = "bpmn2::CallConversation::properties::messageFlowRefs";
			
			
			public static String correlationKeys = "bpmn2::CallConversation::properties::correlationKeys";
			
			
			public static String calledCollaborationRef = "bpmn2::CallConversation::properties::calledCollaborationRef";
			
			
			public static String participantAssociations = "bpmn2::CallConversation::properties::participantAssociations";
			
	
		}
	
	}

	/**
	 * Conversation view descriptor
	 * 
	 */
	public static class Conversation {
		public static class Properties {
	
			
			public static String id = "bpmn2::Conversation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Conversation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Conversation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Conversation::properties::documentation";
			
			
			public static String name = "bpmn2::Conversation::properties::name";
			
			
			public static String participantRefs = "bpmn2::Conversation::properties::participantRefs";
			
			
			public static String messageFlowRefs = "bpmn2::Conversation::properties::messageFlowRefs";
			
			
			public static String correlationKeys = "bpmn2::Conversation::properties::correlationKeys";
			
	
		}
	
	}

	/**
	 * SubConversation view descriptor
	 * 
	 */
	public static class SubConversation {
		public static class Properties {
	
			
			public static String id = "bpmn2::SubConversation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::SubConversation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::SubConversation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::SubConversation::properties::documentation";
			
			
			public static String name = "bpmn2::SubConversation::properties::name";
			
			
			public static String participantRefs = "bpmn2::SubConversation::properties::participantRefs";
			
			
			public static String messageFlowRefs = "bpmn2::SubConversation::properties::messageFlowRefs";
			
			
			public static String correlationKeys = "bpmn2::SubConversation::properties::correlationKeys";
			
	
		}
	
	}

	/**
	 * GlobalConversation view descriptor
	 * 
	 */
	public static class GlobalConversation {
		public static class Properties {
	
			
			public static String id = "bpmn2::GlobalConversation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::GlobalConversation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::GlobalConversation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::GlobalConversation::properties::documentation";
			
			
			public static String name = "bpmn2::GlobalConversation::properties::name";
			
			
			public static String isClosed = "bpmn2::GlobalConversation::properties::isClosed";
			
			
			public static String choreographyRef = "bpmn2::GlobalConversation::properties::choreographyRef";
			
			
			public static String artifacts = "bpmn2::GlobalConversation::properties::artifacts";
			
			
			public static String participantAssociations = "bpmn2::GlobalConversation::properties::participantAssociations";
			
			
			public static String messageFlowAssociations = "bpmn2::GlobalConversation::properties::messageFlowAssociations";
			
			
			public static String messageFlows = "bpmn2::GlobalConversation::properties::messageFlows";
			
			
			public static String correlationKeys = "bpmn2::GlobalConversation::properties::correlationKeys";
			
	
		}
	
	}

	/**
	 * PartnerEntity view descriptor
	 * 
	 */
	public static class PartnerEntity {
		public static class Properties {
	
			
			public static String id = "bpmn2::PartnerEntity::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::PartnerEntity::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::PartnerEntity::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::PartnerEntity::properties::documentation";
			
			
			public static String name = "bpmn2::PartnerEntity::properties::name";
			
			
			public static String participantRef = "bpmn2::PartnerEntity::properties::participantRef";
			
	
		}
	
	}

	/**
	 * PartnerRole view descriptor
	 * 
	 */
	public static class PartnerRole {
		public static class Properties {
	
			
			public static String id = "bpmn2::PartnerRole::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::PartnerRole::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::PartnerRole::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::PartnerRole::properties::documentation";
			
			
			public static String name = "bpmn2::PartnerRole::properties::name";
			
			
			public static String participantRef = "bpmn2::PartnerRole::properties::participantRef";
			
	
		}
	
	}

	/**
	 * CallChoreography view descriptor
	 * 
	 */
	public static class CallChoreography {
		public static class Properties {
	
			
			public static String id = "bpmn2::CallChoreography::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CallChoreography::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CallChoreography::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CallChoreography::properties::documentation";
			
			
			public static String name = "bpmn2::CallChoreography::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::CallChoreography::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::CallChoreography::properties::outgoing";
			
			
			public static String incoming = "bpmn2::CallChoreography::properties::incoming";
			
			
			public static String participantRefs = "bpmn2::CallChoreography::properties::participantRefs";
			
			
			public static String initiatingParticipantRef = "bpmn2::CallChoreography::properties::initiatingParticipantRef";
			
			
			public static String correlationKeys = "bpmn2::CallChoreography::properties::correlationKeys";
			
			
			public static String loopType = "bpmn2::CallChoreography::properties::loopType";
			
			
			public static String calledChoreographyRef = "bpmn2::CallChoreography::properties::calledChoreographyRef";
			
			
			public static String participantAssociations = "bpmn2::CallChoreography::properties::participantAssociations";
			
	
		}
	
	}

	/**
	 * SubChoreography view descriptor
	 * 
	 */
	public static class SubChoreography {
		public static class Properties {
	
			
			public static String id = "bpmn2::SubChoreography::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::SubChoreography::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::SubChoreography::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::SubChoreography::properties::documentation";
			
			
			public static String name = "bpmn2::SubChoreography::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::SubChoreography::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::SubChoreography::properties::outgoing";
			
			
			public static String incoming = "bpmn2::SubChoreography::properties::incoming";
			
			
			public static String participantRefs = "bpmn2::SubChoreography::properties::participantRefs";
			
			
			public static String initiatingParticipantRef = "bpmn2::SubChoreography::properties::initiatingParticipantRef";
			
			
			public static String correlationKeys = "bpmn2::SubChoreography::properties::correlationKeys";
			
			
			public static String loopType = "bpmn2::SubChoreography::properties::loopType";
			
			
			public static String laneSets = "bpmn2::SubChoreography::properties::laneSets";
			
			
			public static String artifacts = "bpmn2::SubChoreography::properties::artifacts";
			
	
		}
	
	}

	/**
	 * ChoreographyTask view descriptor
	 * 
	 */
	public static class ChoreographyTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::ChoreographyTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ChoreographyTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ChoreographyTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ChoreographyTask::properties::documentation";
			
			
			public static String name = "bpmn2::ChoreographyTask::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::ChoreographyTask::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::ChoreographyTask::properties::outgoing";
			
			
			public static String incoming = "bpmn2::ChoreographyTask::properties::incoming";
			
			
			public static String participantRefs = "bpmn2::ChoreographyTask::properties::participantRefs";
			
			
			public static String initiatingParticipantRef = "bpmn2::ChoreographyTask::properties::initiatingParticipantRef";
			
			
			public static String correlationKeys = "bpmn2::ChoreographyTask::properties::correlationKeys";
			
			
			public static String loopType = "bpmn2::ChoreographyTask::properties::loopType";
			
			
			public static String messageFlowRef = "bpmn2::ChoreographyTask::properties::messageFlowRef";
			
	
		}
	
	}

	/**
	 * GlobalChoreographyTask view descriptor
	 * 
	 */
	public static class GlobalChoreographyTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::GlobalChoreographyTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::GlobalChoreographyTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::GlobalChoreographyTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::GlobalChoreographyTask::properties::documentation";
			
			
			public static String name = "bpmn2::GlobalChoreographyTask::properties::name";
			
			
			public static String isClosed = "bpmn2::GlobalChoreographyTask::properties::isClosed";
			
			
			public static String choreographyRef = "bpmn2::GlobalChoreographyTask::properties::choreographyRef";
			
			
			public static String artifacts = "bpmn2::GlobalChoreographyTask::properties::artifacts";
			
			
			public static String participantAssociations = "bpmn2::GlobalChoreographyTask::properties::participantAssociations";
			
			
			public static String messageFlowAssociations = "bpmn2::GlobalChoreographyTask::properties::messageFlowAssociations";
			
			
			public static String messageFlows = "bpmn2::GlobalChoreographyTask::properties::messageFlows";
			
			
			public static String correlationKeys = "bpmn2::GlobalChoreographyTask::properties::correlationKeys";
			
			
			public static String laneSets = "bpmn2::GlobalChoreographyTask::properties::laneSets";
			
			
			public static String initiatingParticipantRef = "bpmn2::GlobalChoreographyTask::properties::initiatingParticipantRef";
			
	
		}
	
	}

	/**
	 * TextAnnotation view descriptor
	 * 
	 */
	public static class TextAnnotation {
		public static class Properties {
	
			
			public static String id = "bpmn2::TextAnnotation::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::TextAnnotation::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::TextAnnotation::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::TextAnnotation::properties::documentation";
			
			
			public static String text = "bpmn2::TextAnnotation::properties::text";
			
			
			public static String textFormat = "bpmn2::TextAnnotation::properties::textFormat";
			
	
		}
	
	}

	/**
	 * Group view descriptor
	 * 
	 */
	public static class Group {
		public static class Properties {
	
			
			public static String id = "bpmn2::Group::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Group::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Group::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Group::properties::documentation";
			
			
			public static String categoryValueRef = "bpmn2::Group::properties::categoryValueRef";
			
	
		}
	
	}

	/**
	 * Association view descriptor
	 * 
	 */
	public static class Association {
		public static class Properties {
	
			
			public static String id = "bpmn2::Association::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Association::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Association::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Association::properties::documentation";
			
			
			public static String associationDirection = "bpmn2::Association::properties::associationDirection";
			
			
			public static String sourceRef = "bpmn2::Association::properties::sourceRef";
			
			
			public static String targetRef = "bpmn2::Association::properties::targetRef";
			
	
		}
	
	}

	/**
	 * Category view descriptor
	 * 
	 */
	public static class Category {
		public static class Properties {
	
			
			public static String id = "bpmn2::Category::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Category::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Category::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Category::properties::documentation";
			
			
			public static String name = "bpmn2::Category::properties::name";
			
	
		}
	
	}

	/**
	 * ServiceTask view descriptor
	 * 
	 */
	public static class ServiceTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::ServiceTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ServiceTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ServiceTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ServiceTask::properties::documentation";
			
			
			public static String name = "bpmn2::ServiceTask::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::ServiceTask::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::ServiceTask::properties::outgoing";
			
			
			public static String incoming = "bpmn2::ServiceTask::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::ServiceTask::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::ServiceTask::properties::resources";
			
			
			public static String default_ = "bpmn2::ServiceTask::properties::default";
			
			
			public static String properties_ = "bpmn2::ServiceTask::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::ServiceTask::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::ServiceTask::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::ServiceTask::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::ServiceTask::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::ServiceTask::properties::completionQuantity";
			
			
			public static String implementation = "bpmn2::ServiceTask::properties::implementation";
			
			
			public static String operationRef = "bpmn2::ServiceTask::properties::operationRef";
			
	
		}
	
	}

	/**
	 * SubProcess view descriptor
	 * 
	 */
	public static class SubProcess {
		public static class Properties {
	
			
			public static String id = "bpmn2::SubProcess::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::SubProcess::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::SubProcess::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::SubProcess::properties::documentation";
			
			
			public static String name = "bpmn2::SubProcess::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::SubProcess::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::SubProcess::properties::outgoing";
			
			
			public static String incoming = "bpmn2::SubProcess::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::SubProcess::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::SubProcess::properties::resources";
			
			
			public static String default_ = "bpmn2::SubProcess::properties::default";
			
			
			public static String properties_ = "bpmn2::SubProcess::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::SubProcess::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::SubProcess::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::SubProcess::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::SubProcess::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::SubProcess::properties::completionQuantity";
			
			
			public static String laneSets = "bpmn2::SubProcess::properties::laneSets";
			
			
			public static String triggeredByEvent = "bpmn2::SubProcess::properties::triggeredByEvent";
			
			
			public static String artifacts = "bpmn2::SubProcess::properties::artifacts";
			
	
		}
	
	}

	/**
	 * MultiInstanceLoopCharacteristics view descriptor
	 * 
	 */
	public static class MultiInstanceLoopCharacteristics {
		public static class Properties {
	
			
			public static String id = "bpmn2::MultiInstanceLoopCharacteristics::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::MultiInstanceLoopCharacteristics::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::MultiInstanceLoopCharacteristics::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::MultiInstanceLoopCharacteristics::properties::documentation";
			
			
			public static String isSequential = "bpmn2::MultiInstanceLoopCharacteristics::properties::isSequential";
			
			
			public static String behavior = "bpmn2::MultiInstanceLoopCharacteristics::properties::behavior";
			
			
			public static String loopDataInputRef = "bpmn2::MultiInstanceLoopCharacteristics::properties::loopDataInputRef";
			
			
			public static String loopDataOutputRef = "bpmn2::MultiInstanceLoopCharacteristics::properties::loopDataOutputRef";
			
			
			public static String complexBehaviorDefinition = "bpmn2::MultiInstanceLoopCharacteristics::properties::complexBehaviorDefinition";
			
			
			public static String oneBehaviorEventRef = "bpmn2::MultiInstanceLoopCharacteristics::properties::oneBehaviorEventRef";
			
			
			public static String noneBehaviorEventRef = "bpmn2::MultiInstanceLoopCharacteristics::properties::noneBehaviorEventRef";
			
	
		}
	
	}

	/**
	 * ComplexBehaviorDefinition view descriptor
	 * 
	 */
	public static class ComplexBehaviorDefinition {
		public static class Properties {
	
			
			public static String id = "bpmn2::ComplexBehaviorDefinition::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ComplexBehaviorDefinition::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ComplexBehaviorDefinition::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ComplexBehaviorDefinition::properties::documentation";
			
	
		}
	
	}

	/**
	 * StandardLoopCharacteristics view descriptor
	 * 
	 */
	public static class StandardLoopCharacteristics {
		public static class Properties {
	
			
			public static String id = "bpmn2::StandardLoopCharacteristics::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::StandardLoopCharacteristics::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::StandardLoopCharacteristics::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::StandardLoopCharacteristics::properties::documentation";
			
			
			public static String testBefore = "bpmn2::StandardLoopCharacteristics::properties::testBefore";
			
	
		}
	
	}

	/**
	 * CallActivity view descriptor
	 * 
	 */
	public static class CallActivity {
		public static class Properties {
	
			
			public static String id = "bpmn2::CallActivity::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::CallActivity::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::CallActivity::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::CallActivity::properties::documentation";
			
			
			public static String name = "bpmn2::CallActivity::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::CallActivity::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::CallActivity::properties::outgoing";
			
			
			public static String incoming = "bpmn2::CallActivity::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::CallActivity::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::CallActivity::properties::resources";
			
			
			public static String default_ = "bpmn2::CallActivity::properties::default";
			
			
			public static String properties_ = "bpmn2::CallActivity::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::CallActivity::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::CallActivity::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::CallActivity::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::CallActivity::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::CallActivity::properties::completionQuantity";
			
			
			public static String calledElementRef = "bpmn2::CallActivity::properties::calledElementRef";
			
	
		}
	
	}

	/**
	 * SendTask view descriptor
	 * 
	 */
	public static class SendTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::SendTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::SendTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::SendTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::SendTask::properties::documentation";
			
			
			public static String name = "bpmn2::SendTask::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::SendTask::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::SendTask::properties::outgoing";
			
			
			public static String incoming = "bpmn2::SendTask::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::SendTask::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::SendTask::properties::resources";
			
			
			public static String default_ = "bpmn2::SendTask::properties::default";
			
			
			public static String properties_ = "bpmn2::SendTask::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::SendTask::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::SendTask::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::SendTask::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::SendTask::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::SendTask::properties::completionQuantity";
			
			
			public static String implementation = "bpmn2::SendTask::properties::implementation";
			
			
			public static String operationRef = "bpmn2::SendTask::properties::operationRef";
			
			
			public static String messageRef = "bpmn2::SendTask::properties::messageRef";
			
	
		}
	
	}

	/**
	 * ReceiveTask view descriptor
	 * 
	 */
	public static class ReceiveTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::ReceiveTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ReceiveTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ReceiveTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ReceiveTask::properties::documentation";
			
			
			public static String name = "bpmn2::ReceiveTask::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::ReceiveTask::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::ReceiveTask::properties::outgoing";
			
			
			public static String incoming = "bpmn2::ReceiveTask::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::ReceiveTask::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::ReceiveTask::properties::resources";
			
			
			public static String default_ = "bpmn2::ReceiveTask::properties::default";
			
			
			public static String properties_ = "bpmn2::ReceiveTask::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::ReceiveTask::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::ReceiveTask::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::ReceiveTask::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::ReceiveTask::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::ReceiveTask::properties::completionQuantity";
			
			
			public static String implementation = "bpmn2::ReceiveTask::properties::implementation";
			
			
			public static String instantiate = "bpmn2::ReceiveTask::properties::instantiate";
			
			
			public static String operationRef = "bpmn2::ReceiveTask::properties::operationRef";
			
			
			public static String messageRef = "bpmn2::ReceiveTask::properties::messageRef";
			
	
		}
	
	}

	/**
	 * ScriptTask view descriptor
	 * 
	 */
	public static class ScriptTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::ScriptTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::ScriptTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::ScriptTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::ScriptTask::properties::documentation";
			
			
			public static String name = "bpmn2::ScriptTask::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::ScriptTask::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::ScriptTask::properties::outgoing";
			
			
			public static String incoming = "bpmn2::ScriptTask::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::ScriptTask::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::ScriptTask::properties::resources";
			
			
			public static String default_ = "bpmn2::ScriptTask::properties::default";
			
			
			public static String properties_ = "bpmn2::ScriptTask::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::ScriptTask::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::ScriptTask::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::ScriptTask::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::ScriptTask::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::ScriptTask::properties::completionQuantity";
			
			
			public static String scriptFormat = "bpmn2::ScriptTask::properties::scriptFormat";
			
			
			public static String script = "bpmn2::ScriptTask::properties::script";
			
	
		}
	
	}

	/**
	 * BusinessRuleTask view descriptor
	 * 
	 */
	public static class BusinessRuleTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::BusinessRuleTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::BusinessRuleTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::BusinessRuleTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::BusinessRuleTask::properties::documentation";
			
			
			public static String name = "bpmn2::BusinessRuleTask::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::BusinessRuleTask::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::BusinessRuleTask::properties::outgoing";
			
			
			public static String incoming = "bpmn2::BusinessRuleTask::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::BusinessRuleTask::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::BusinessRuleTask::properties::resources";
			
			
			public static String default_ = "bpmn2::BusinessRuleTask::properties::default";
			
			
			public static String properties_ = "bpmn2::BusinessRuleTask::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::BusinessRuleTask::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::BusinessRuleTask::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::BusinessRuleTask::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::BusinessRuleTask::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::BusinessRuleTask::properties::completionQuantity";
			
			
			public static String implementation = "bpmn2::BusinessRuleTask::properties::implementation";
			
	
		}
	
	}

	/**
	 * AdHocSubProcess view descriptor
	 * 
	 */
	public static class AdHocSubProcess {
		public static class Properties {
	
			
			public static String id = "bpmn2::AdHocSubProcess::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::AdHocSubProcess::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::AdHocSubProcess::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::AdHocSubProcess::properties::documentation";
			
			
			public static String name = "bpmn2::AdHocSubProcess::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::AdHocSubProcess::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::AdHocSubProcess::properties::outgoing";
			
			
			public static String incoming = "bpmn2::AdHocSubProcess::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::AdHocSubProcess::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::AdHocSubProcess::properties::resources";
			
			
			public static String default_ = "bpmn2::AdHocSubProcess::properties::default";
			
			
			public static String properties_ = "bpmn2::AdHocSubProcess::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::AdHocSubProcess::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::AdHocSubProcess::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::AdHocSubProcess::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::AdHocSubProcess::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::AdHocSubProcess::properties::completionQuantity";
			
			
			public static String laneSets = "bpmn2::AdHocSubProcess::properties::laneSets";
			
			
			public static String triggeredByEvent = "bpmn2::AdHocSubProcess::properties::triggeredByEvent";
			
			
			public static String artifacts = "bpmn2::AdHocSubProcess::properties::artifacts";
			
			
			public static String ordering = "bpmn2::AdHocSubProcess::properties::ordering";
			
			
			public static String cancelRemainingInstances = "bpmn2::AdHocSubProcess::properties::cancelRemainingInstances";
			
	
		}
	
	}

	/**
	 * Transaction view descriptor
	 * 
	 */
	public static class Transaction {
		public static class Properties {
	
			
			public static String id = "bpmn2::Transaction::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Transaction::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Transaction::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Transaction::properties::documentation";
			
			
			public static String name = "bpmn2::Transaction::properties::name";
			
			
			public static String categoryValueRef = "bpmn2::Transaction::properties::categoryValueRef";
			
			
			public static String outgoing = "bpmn2::Transaction::properties::outgoing";
			
			
			public static String incoming = "bpmn2::Transaction::properties::incoming";
			
			
			public static String isForCompensation = "bpmn2::Transaction::properties::isForCompensation";
			
			
			public static String resources = "bpmn2::Transaction::properties::resources";
			
			
			public static String default_ = "bpmn2::Transaction::properties::default";
			
			
			public static String properties_ = "bpmn2::Transaction::properties::properties_";
			
			
			public static String boundaryEventRefs = "bpmn2::Transaction::properties::boundaryEventRefs";
			
			
			public static String dataInputAssociations = "bpmn2::Transaction::properties::dataInputAssociations";
			
			
			public static String dataOutputAssociations = "bpmn2::Transaction::properties::dataOutputAssociations";
			
			
			public static String startQuantity = "bpmn2::Transaction::properties::startQuantity";
			
			
			public static String completionQuantity = "bpmn2::Transaction::properties::completionQuantity";
			
			
			public static String laneSets = "bpmn2::Transaction::properties::laneSets";
			
			
			public static String triggeredByEvent = "bpmn2::Transaction::properties::triggeredByEvent";
			
			
			public static String artifacts = "bpmn2::Transaction::properties::artifacts";
			
			
			public static String protocol = "bpmn2::Transaction::properties::protocol";
			
			
			public static String method = "bpmn2::Transaction::properties::method";
			
	
		}
	
	}

	/**
	 * GlobalScriptTask view descriptor
	 * 
	 */
	public static class GlobalScriptTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::GlobalScriptTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::GlobalScriptTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::GlobalScriptTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::GlobalScriptTask::properties::documentation";
			
			
			public static String name = "bpmn2::GlobalScriptTask::properties::name";
			
			
			public static String supportedInterfaceRefs = "bpmn2::GlobalScriptTask::properties::supportedInterfaceRefs";
			
			
			public static String ioBinding = "bpmn2::GlobalScriptTask::properties::ioBinding";
			
			
			public static String resources = "bpmn2::GlobalScriptTask::properties::resources";
			
			
			public static String scriptLanguage = "bpmn2::GlobalScriptTask::properties::scriptLanguage";
			
			
			public static String script = "bpmn2::GlobalScriptTask::properties::script";
			
	
		}
	
	}

	/**
	 * GlobalBusinessRuleTask view descriptor
	 * 
	 */
	public static class GlobalBusinessRuleTask {
		public static class Properties {
	
			
			public static String id = "bpmn2::GlobalBusinessRuleTask::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::GlobalBusinessRuleTask::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::GlobalBusinessRuleTask::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::GlobalBusinessRuleTask::properties::documentation";
			
			
			public static String name = "bpmn2::GlobalBusinessRuleTask::properties::name";
			
			
			public static String supportedInterfaceRefs = "bpmn2::GlobalBusinessRuleTask::properties::supportedInterfaceRefs";
			
			
			public static String ioBinding = "bpmn2::GlobalBusinessRuleTask::properties::ioBinding";
			
			
			public static String resources = "bpmn2::GlobalBusinessRuleTask::properties::resources";
			
			
			public static String implementation = "bpmn2::GlobalBusinessRuleTask::properties::implementation";
			
	
		}
	
	}

	/**
	 * Definitions view descriptor
	 * 
	 */
	public static class Definitions {
		public static class Properties {
	
			
			public static String id = "bpmn2::Definitions::properties::id";
			
			
			public static String extensionDefinitions = "bpmn2::Definitions::properties::extensionDefinitions";
			
			
			public static String extensionValues = "bpmn2::Definitions::properties::extensionValues";
			
			
			public static String documentation = "bpmn2::Definitions::properties::documentation";
			
			
			public static String name = "bpmn2::Definitions::properties::name";
			
			
			public static String targetNamespace = "bpmn2::Definitions::properties::targetNamespace";
			
			
			public static String expressionLanguage = "bpmn2::Definitions::properties::expressionLanguage";
			
			
			public static String typeLanguage = "bpmn2::Definitions::properties::typeLanguage";
			
			
			public static String imports = "bpmn2::Definitions::properties::imports";
			
			
			public static String extensions = "bpmn2::Definitions::properties::extensions";
			
			
			public static String relationships = "bpmn2::Definitions::properties::relationships";
			
			
			public static String rootElements = "bpmn2::Definitions::properties::rootElements";
			
			
			public static String exporter = "bpmn2::Definitions::properties::exporter";
			
			
			public static String exporterVersion = "bpmn2::Definitions::properties::exporterVersion";
			
	
		}
	
	}

}

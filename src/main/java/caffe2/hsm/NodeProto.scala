// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package caffe2.hsm

/** Each node in the hierarchy contains links to either leaf nodes or more
  * non-terminal nodes
  *
  * @param children
  *   Links to non-terminal children nodes
  * @param wordIds
  *   Links to terminal (leaf) nodes
  */
@SerialVersionUID(0L)
final case class NodeProto(
    children: _root_.scala.Seq[caffe2.hsm.NodeProto] = _root_.scala.Seq.empty,
    wordIds: _root_.scala.Seq[_root_.scala.Int] = _root_.scala.Seq.empty,
    offset: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    scores: _root_.scala.Seq[_root_.scala.Float] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[NodeProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      children.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      wordIds.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
      }
      if (offset.isDefined) {
        val __value = offset.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
      };
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
      };
      __size += 5 * scores.size
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      children.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      wordIds.foreach { __v =>
        val __m = __v
        _output__.writeInt32(2, __m)
      };
      offset.foreach { __v =>
        val __m = __v
        _output__.writeInt32(3, __m)
      };
      name.foreach { __v =>
        val __m = __v
        _output__.writeString(4, __m)
      };
      scores.foreach { __v =>
        val __m = __v
        _output__.writeFloat(5, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def clearChildren = copy(children = _root_.scala.Seq.empty)
    def addChildren(__vs: caffe2.hsm.NodeProto*): NodeProto = addAllChildren(__vs)
    def addAllChildren(__vs: Iterable[caffe2.hsm.NodeProto]): NodeProto = copy(children = children ++ __vs)
    def withChildren(__v: _root_.scala.Seq[caffe2.hsm.NodeProto]): NodeProto = copy(children = __v)
    def clearWordIds = copy(wordIds = _root_.scala.Seq.empty)
    def addWordIds(__vs: _root_.scala.Int*): NodeProto = addAllWordIds(__vs)
    def addAllWordIds(__vs: Iterable[_root_.scala.Int]): NodeProto = copy(wordIds = wordIds ++ __vs)
    def withWordIds(__v: _root_.scala.Seq[_root_.scala.Int]): NodeProto = copy(wordIds = __v)
    def getOffset: _root_.scala.Int = offset.getOrElse(0)
    def clearOffset: NodeProto = copy(offset = _root_.scala.None)
    def withOffset(__v: _root_.scala.Int): NodeProto = copy(offset = Option(__v))
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: NodeProto = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): NodeProto = copy(name = Option(__v))
    def clearScores = copy(scores = _root_.scala.Seq.empty)
    def addScores(__vs: _root_.scala.Float*): NodeProto = addAllScores(__vs)
    def addAllScores(__vs: Iterable[_root_.scala.Float]): NodeProto = copy(scores = scores ++ __vs)
    def withScores(__v: _root_.scala.Seq[_root_.scala.Float]): NodeProto = copy(scores = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => children
        case 2 => wordIds
        case 3 => offset.orNull
        case 4 => name.orNull
        case 5 => scores
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(children.iterator.map(_.toPMessage).toVector)
        case 2 => _root_.scalapb.descriptors.PRepeated(wordIds.iterator.map(_root_.scalapb.descriptors.PInt(_)).toVector)
        case 3 => offset.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => name.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => _root_.scalapb.descriptors.PRepeated(scores.iterator.map(_root_.scalapb.descriptors.PFloat(_)).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = caffe2.hsm.NodeProto
    // @@protoc_insertion_point(GeneratedMessage[caffe2.NodeProto])
}

object NodeProto extends scalapb.GeneratedMessageCompanion[caffe2.hsm.NodeProto] with scalapb.HasBuilder[caffe2.hsm.NodeProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[caffe2.hsm.NodeProto] with scalapb.HasBuilder[caffe2.hsm.NodeProto] = this
  def merge(`_message__`: caffe2.hsm.NodeProto, `_input__`: _root_.com.google.protobuf.CodedInputStream): caffe2.hsm.NodeProto = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[caffe2.hsm.NodeProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      caffe2.hsm.NodeProto(
        children = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[caffe2.hsm.NodeProto]]).getOrElse(_root_.scala.Seq.empty),
        wordIds = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.Seq.empty),
        offset = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        scores = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Seq[_root_.scala.Float]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HsmProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HsmProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = caffe2.hsm.NodeProto
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = caffe2.hsm.NodeProto(
    children = _root_.scala.Seq.empty,
    wordIds = _root_.scala.Seq.empty,
    offset = _root_.scala.None,
    name = _root_.scala.None,
    scores = _root_.scala.Seq.empty
  )
  final class Builder private (
    private val __children: _root_.scala.collection.immutable.VectorBuilder[caffe2.hsm.NodeProto],
    private val __wordIds: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int],
    private var __offset: _root_.scala.Option[_root_.scala.Int],
    private var __name: _root_.scala.Option[_root_.scala.Predef.String],
    private val __scores: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Float],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[caffe2.hsm.NodeProto] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __children += _root_.scalapb.LiteParser.readMessage[caffe2.hsm.NodeProto](_input__)
          case 16 =>
            __wordIds += _input__.readInt32()
          case 18 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __wordIds += _input__.readInt32()
            }
            _input__.popLimit(oldLimit)
          }
          case 24 =>
            __offset = Option(_input__.readInt32())
          case 34 =>
            __name = Option(_input__.readStringRequireUtf8())
          case 45 =>
            __scores += _input__.readFloat()
          case 42 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __scores += _input__.readFloat()
            }
            _input__.popLimit(oldLimit)
          }
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): caffe2.hsm.NodeProto = {
      caffe2.hsm.NodeProto(
        children = __children.result(),
        wordIds = __wordIds.result(),
        offset = __offset,
        name = __name,
        scores = __scores.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[caffe2.hsm.NodeProto, caffe2.hsm.NodeProto.Builder] {
    def apply(): Builder = new Builder(
      __children = new _root_.scala.collection.immutable.VectorBuilder[caffe2.hsm.NodeProto],
      __wordIds = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int],
      __offset = _root_.scala.None,
      __name = _root_.scala.None,
      __scores = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Float],
      `_unknownFields__` = null
    )
    def apply(`_message__`: caffe2.hsm.NodeProto): Builder = new Builder(
        __children = new _root_.scala.collection.immutable.VectorBuilder[caffe2.hsm.NodeProto] ++= _message__.children,
        __wordIds = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int] ++= _message__.wordIds,
        __offset = _message__.offset,
        __name = _message__.name,
        __scores = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Float] ++= _message__.scores,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = caffe2.hsm.NodeProto.Builder()
  def newBuilder(`_message__`: caffe2.hsm.NodeProto): Builder = caffe2.hsm.NodeProto.Builder(_message__)
  implicit class NodeProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, caffe2.hsm.NodeProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, caffe2.hsm.NodeProto](_l) {
    def children: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[caffe2.hsm.NodeProto]] = field(_.children)((c_, f_) => c_.copy(children = f_))
    def wordIds: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Int]] = field(_.wordIds)((c_, f_) => c_.copy(wordIds = f_))
    def offset: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getOffset)((c_, f_) => c_.copy(offset = Option(f_)))
    def optionalOffset: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.offset)((c_, f_) => c_.copy(offset = f_))
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def scores: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Float]] = field(_.scores)((c_, f_) => c_.copy(scores = f_))
  }
  final val CHILDREN_FIELD_NUMBER = 1
  final val WORD_IDS_FIELD_NUMBER = 2
  final val OFFSET_FIELD_NUMBER = 3
  final val NAME_FIELD_NUMBER = 4
  final val SCORES_FIELD_NUMBER = 5
  def of(
    children: _root_.scala.Seq[caffe2.hsm.NodeProto],
    wordIds: _root_.scala.Seq[_root_.scala.Int],
    offset: _root_.scala.Option[_root_.scala.Int],
    name: _root_.scala.Option[_root_.scala.Predef.String],
    scores: _root_.scala.Seq[_root_.scala.Float]
  ): _root_.caffe2.hsm.NodeProto = _root_.caffe2.hsm.NodeProto(
    children,
    wordIds,
    offset,
    name,
    scores
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[caffe2.NodeProto])
}
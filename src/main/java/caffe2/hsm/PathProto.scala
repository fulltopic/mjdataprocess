// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package caffe2.hsm

/** Each PathProto belongs to a word and is an array of nodes in the
  * path from the root to the leaf (which is the word itself) in the tree.
  */
@SerialVersionUID(0L)
final case class PathProto(
    wordId: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
    pathNodes: _root_.scala.Seq[caffe2.hsm.PathNodeProto] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[PathProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (wordId.isDefined) {
        val __value = wordId.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
      };
      pathNodes.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
      wordId.foreach { __v =>
        val __m = __v
        _output__.writeInt32(1, __m)
      };
      pathNodes.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getWordId: _root_.scala.Int = wordId.getOrElse(0)
    def clearWordId: PathProto = copy(wordId = _root_.scala.None)
    def withWordId(__v: _root_.scala.Int): PathProto = copy(wordId = Option(__v))
    def clearPathNodes = copy(pathNodes = _root_.scala.Seq.empty)
    def addPathNodes(__vs: caffe2.hsm.PathNodeProto*): PathProto = addAllPathNodes(__vs)
    def addAllPathNodes(__vs: Iterable[caffe2.hsm.PathNodeProto]): PathProto = copy(pathNodes = pathNodes ++ __vs)
    def withPathNodes(__v: _root_.scala.Seq[caffe2.hsm.PathNodeProto]): PathProto = copy(pathNodes = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => wordId.orNull
        case 2 => pathNodes
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => wordId.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PRepeated(pathNodes.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = caffe2.hsm.PathProto
    // @@protoc_insertion_point(GeneratedMessage[caffe2.PathProto])
}

object PathProto extends scalapb.GeneratedMessageCompanion[caffe2.hsm.PathProto] with scalapb.HasBuilder[caffe2.hsm.PathProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[caffe2.hsm.PathProto] with scalapb.HasBuilder[caffe2.hsm.PathProto] = this
  def merge(`_message__`: caffe2.hsm.PathProto, `_input__`: _root_.com.google.protobuf.CodedInputStream): caffe2.hsm.PathProto = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[caffe2.hsm.PathProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      caffe2.hsm.PathProto(
        wordId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
        pathNodes = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[caffe2.hsm.PathNodeProto]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HsmProto.javaDescriptor.getMessageTypes().get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HsmProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = caffe2.hsm.PathNodeProto
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = caffe2.hsm.PathProto(
    wordId = _root_.scala.None,
    pathNodes = _root_.scala.Seq.empty
  )
  final class Builder private (
    private var __wordId: _root_.scala.Option[_root_.scala.Int],
    private val __pathNodes: _root_.scala.collection.immutable.VectorBuilder[caffe2.hsm.PathNodeProto],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[caffe2.hsm.PathProto] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __wordId = Option(_input__.readInt32())
          case 18 =>
            __pathNodes += _root_.scalapb.LiteParser.readMessage[caffe2.hsm.PathNodeProto](_input__)
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): caffe2.hsm.PathProto = {
      caffe2.hsm.PathProto(
        wordId = __wordId,
        pathNodes = __pathNodes.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[caffe2.hsm.PathProto, caffe2.hsm.PathProto.Builder] {
    def apply(): Builder = new Builder(
      __wordId = _root_.scala.None,
      __pathNodes = new _root_.scala.collection.immutable.VectorBuilder[caffe2.hsm.PathNodeProto],
      `_unknownFields__` = null
    )
    def apply(`_message__`: caffe2.hsm.PathProto): Builder = new Builder(
        __wordId = _message__.wordId,
        __pathNodes = new _root_.scala.collection.immutable.VectorBuilder[caffe2.hsm.PathNodeProto] ++= _message__.pathNodes,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = caffe2.hsm.PathProto.Builder()
  def newBuilder(`_message__`: caffe2.hsm.PathProto): Builder = caffe2.hsm.PathProto.Builder(_message__)
  implicit class PathProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, caffe2.hsm.PathProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, caffe2.hsm.PathProto](_l) {
    def wordId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getWordId)((c_, f_) => c_.copy(wordId = Option(f_)))
    def optionalWordId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.wordId)((c_, f_) => c_.copy(wordId = f_))
    def pathNodes: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[caffe2.hsm.PathNodeProto]] = field(_.pathNodes)((c_, f_) => c_.copy(pathNodes = f_))
  }
  final val WORD_ID_FIELD_NUMBER = 1
  final val PATH_NODES_FIELD_NUMBER = 2
  def of(
    wordId: _root_.scala.Option[_root_.scala.Int],
    pathNodes: _root_.scala.Seq[caffe2.hsm.PathNodeProto]
  ): _root_.caffe2.hsm.PathProto = _root_.caffe2.hsm.PathProto(
    wordId,
    pathNodes
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[caffe2.PathProto])
}

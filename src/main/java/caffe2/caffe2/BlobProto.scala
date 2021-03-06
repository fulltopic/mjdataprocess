// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package caffe2.caffe2

/** Protobuf format for blobs that are not Tensors. We use a key to store the
  * type of the blob. For example for a serialized DBProto, the type should
  * be "DBReader" and the content should be a serialized DBProto object.
  *
  * @param contentNumChunks
  *   If blob is not Tensor and is divided into chunks, content_num_chunks
  *   contains number of chunks, into which blob was divided.
  */
@SerialVersionUID(0L)
final case class BlobProto(
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    `type`: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    tensor: _root_.scala.Option[caffe2.caffe2.TensorProto] = _root_.scala.None,
    content: _root_.scala.Option[_root_.com.google.protobuf.ByteString] = _root_.scala.None,
    qtensor: _root_.scala.Option[caffe2.caffe2.QTensorProto] = _root_.scala.None,
    contentNumChunks: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
    contentChunkId: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[BlobProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (`type`.isDefined) {
        val __value = `type`.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      };
      if (tensor.isDefined) {
        val __value = tensor.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (content.isDefined) {
        val __value = content.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(4, __value)
      };
      if (qtensor.isDefined) {
        val __value = qtensor.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (contentNumChunks.isDefined) {
        val __value = contentNumChunks.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(6, __value)
      };
      if (contentChunkId.isDefined) {
        val __value = contentChunkId.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(7, __value)
      };
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
      name.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      `type`.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      tensor.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      content.foreach { __v =>
        val __m = __v
        _output__.writeBytes(4, __m)
      };
      qtensor.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      contentNumChunks.foreach { __v =>
        val __m = __v
        _output__.writeInt32(6, __m)
      };
      contentChunkId.foreach { __v =>
        val __m = __v
        _output__.writeInt32(7, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: BlobProto = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): BlobProto = copy(name = Option(__v))
    def getType: _root_.scala.Predef.String = `type`.getOrElse("")
    def clearType: BlobProto = copy(`type` = _root_.scala.None)
    def withType(__v: _root_.scala.Predef.String): BlobProto = copy(`type` = Option(__v))
    def getTensor: caffe2.caffe2.TensorProto = tensor.getOrElse(caffe2.caffe2.TensorProto.defaultInstance)
    def clearTensor: BlobProto = copy(tensor = _root_.scala.None)
    def withTensor(__v: caffe2.caffe2.TensorProto): BlobProto = copy(tensor = Option(__v))
    def getContent: _root_.com.google.protobuf.ByteString = content.getOrElse(_root_.com.google.protobuf.ByteString.EMPTY)
    def clearContent: BlobProto = copy(content = _root_.scala.None)
    def withContent(__v: _root_.com.google.protobuf.ByteString): BlobProto = copy(content = Option(__v))
    def getQtensor: caffe2.caffe2.QTensorProto = qtensor.getOrElse(caffe2.caffe2.QTensorProto.defaultInstance)
    def clearQtensor: BlobProto = copy(qtensor = _root_.scala.None)
    def withQtensor(__v: caffe2.caffe2.QTensorProto): BlobProto = copy(qtensor = Option(__v))
    def getContentNumChunks: _root_.scala.Int = contentNumChunks.getOrElse(0)
    def clearContentNumChunks: BlobProto = copy(contentNumChunks = _root_.scala.None)
    def withContentNumChunks(__v: _root_.scala.Int): BlobProto = copy(contentNumChunks = Option(__v))
    def getContentChunkId: _root_.scala.Int = contentChunkId.getOrElse(0)
    def clearContentChunkId: BlobProto = copy(contentChunkId = _root_.scala.None)
    def withContentChunkId(__v: _root_.scala.Int): BlobProto = copy(contentChunkId = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 2 => `type`.orNull
        case 3 => tensor.orNull
        case 4 => content.orNull
        case 5 => qtensor.orNull
        case 6 => contentNumChunks.orNull
        case 7 => contentChunkId.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => `type`.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => tensor.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => content.map(_root_.scalapb.descriptors.PByteString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => qtensor.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => contentNumChunks.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => contentChunkId.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = caffe2.caffe2.BlobProto
    // @@protoc_insertion_point(GeneratedMessage[caffe2.BlobProto])
}

object BlobProto extends scalapb.GeneratedMessageCompanion[caffe2.caffe2.BlobProto] with scalapb.HasBuilder[caffe2.caffe2.BlobProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[caffe2.caffe2.BlobProto] with scalapb.HasBuilder[caffe2.caffe2.BlobProto] = this
  def merge(`_message__`: caffe2.caffe2.BlobProto, `_input__`: _root_.com.google.protobuf.CodedInputStream): caffe2.caffe2.BlobProto = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[caffe2.caffe2.BlobProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      caffe2.caffe2.BlobProto(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        `type` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        tensor = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[caffe2.caffe2.TensorProto]]),
        content = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.com.google.protobuf.ByteString]]),
        qtensor = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[caffe2.caffe2.QTensorProto]]),
        contentNumChunks = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
        contentChunkId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = Caffe2Proto.javaDescriptor.getMessageTypes().get(18)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = Caffe2Proto.scalaDescriptor.messages(18)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = caffe2.caffe2.TensorProto
      case 5 => __out = caffe2.caffe2.QTensorProto
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = caffe2.caffe2.BlobProto(
    name = _root_.scala.None,
    `type` = _root_.scala.None,
    tensor = _root_.scala.None,
    content = _root_.scala.None,
    qtensor = _root_.scala.None,
    contentNumChunks = _root_.scala.None,
    contentChunkId = _root_.scala.None
  )
  final class Builder private (
    private var __name: _root_.scala.Option[_root_.scala.Predef.String],
    private var __type: _root_.scala.Option[_root_.scala.Predef.String],
    private var __tensor: _root_.scala.Option[caffe2.caffe2.TensorProto],
    private var __content: _root_.scala.Option[_root_.com.google.protobuf.ByteString],
    private var __qtensor: _root_.scala.Option[caffe2.caffe2.QTensorProto],
    private var __contentNumChunks: _root_.scala.Option[_root_.scala.Int],
    private var __contentChunkId: _root_.scala.Option[_root_.scala.Int],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[caffe2.caffe2.BlobProto] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Option(_input__.readStringRequireUtf8())
          case 18 =>
            __type = Option(_input__.readStringRequireUtf8())
          case 26 =>
            __tensor = Option(__tensor.fold(_root_.scalapb.LiteParser.readMessage[caffe2.caffe2.TensorProto](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 34 =>
            __content = Option(_input__.readBytes())
          case 42 =>
            __qtensor = Option(__qtensor.fold(_root_.scalapb.LiteParser.readMessage[caffe2.caffe2.QTensorProto](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 48 =>
            __contentNumChunks = Option(_input__.readInt32())
          case 56 =>
            __contentChunkId = Option(_input__.readInt32())
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): caffe2.caffe2.BlobProto = {
      caffe2.caffe2.BlobProto(
        name = __name,
        `type` = __type,
        tensor = __tensor,
        content = __content,
        qtensor = __qtensor,
        contentNumChunks = __contentNumChunks,
        contentChunkId = __contentChunkId,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[caffe2.caffe2.BlobProto, caffe2.caffe2.BlobProto.Builder] {
    def apply(): Builder = new Builder(
      __name = _root_.scala.None,
      __type = _root_.scala.None,
      __tensor = _root_.scala.None,
      __content = _root_.scala.None,
      __qtensor = _root_.scala.None,
      __contentNumChunks = _root_.scala.None,
      __contentChunkId = _root_.scala.None,
      `_unknownFields__` = null
    )
    def apply(`_message__`: caffe2.caffe2.BlobProto): Builder = new Builder(
        __name = _message__.name,
        __type = _message__.`type`,
        __tensor = _message__.tensor,
        __content = _message__.content,
        __qtensor = _message__.qtensor,
        __contentNumChunks = _message__.contentNumChunks,
        __contentChunkId = _message__.contentChunkId,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = caffe2.caffe2.BlobProto.Builder()
  def newBuilder(`_message__`: caffe2.caffe2.BlobProto): Builder = caffe2.caffe2.BlobProto.Builder(_message__)
  implicit class BlobProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, caffe2.caffe2.BlobProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, caffe2.caffe2.BlobProto](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getType)((c_, f_) => c_.copy(`type` = Option(f_)))
    def optionalType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def tensor: _root_.scalapb.lenses.Lens[UpperPB, caffe2.caffe2.TensorProto] = field(_.getTensor)((c_, f_) => c_.copy(tensor = Option(f_)))
    def optionalTensor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[caffe2.caffe2.TensorProto]] = field(_.tensor)((c_, f_) => c_.copy(tensor = f_))
    def content: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.getContent)((c_, f_) => c_.copy(content = Option(f_)))
    def optionalContent: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.com.google.protobuf.ByteString]] = field(_.content)((c_, f_) => c_.copy(content = f_))
    def qtensor: _root_.scalapb.lenses.Lens[UpperPB, caffe2.caffe2.QTensorProto] = field(_.getQtensor)((c_, f_) => c_.copy(qtensor = Option(f_)))
    def optionalQtensor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[caffe2.caffe2.QTensorProto]] = field(_.qtensor)((c_, f_) => c_.copy(qtensor = f_))
    def contentNumChunks: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getContentNumChunks)((c_, f_) => c_.copy(contentNumChunks = Option(f_)))
    def optionalContentNumChunks: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.contentNumChunks)((c_, f_) => c_.copy(contentNumChunks = f_))
    def contentChunkId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getContentChunkId)((c_, f_) => c_.copy(contentChunkId = Option(f_)))
    def optionalContentChunkId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.contentChunkId)((c_, f_) => c_.copy(contentChunkId = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val TYPE_FIELD_NUMBER = 2
  final val TENSOR_FIELD_NUMBER = 3
  final val CONTENT_FIELD_NUMBER = 4
  final val QTENSOR_FIELD_NUMBER = 5
  final val CONTENT_NUM_CHUNKS_FIELD_NUMBER = 6
  final val CONTENT_CHUNK_ID_FIELD_NUMBER = 7
  def of(
    name: _root_.scala.Option[_root_.scala.Predef.String],
    `type`: _root_.scala.Option[_root_.scala.Predef.String],
    tensor: _root_.scala.Option[caffe2.caffe2.TensorProto],
    content: _root_.scala.Option[_root_.com.google.protobuf.ByteString],
    qtensor: _root_.scala.Option[caffe2.caffe2.QTensorProto],
    contentNumChunks: _root_.scala.Option[_root_.scala.Int],
    contentChunkId: _root_.scala.Option[_root_.scala.Int]
  ): _root_.caffe2.caffe2.BlobProto = _root_.caffe2.caffe2.BlobProto(
    name,
    `type`,
    tensor,
    content,
    qtensor,
    contentNumChunks,
    contentChunkId
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[caffe2.BlobProto])
}

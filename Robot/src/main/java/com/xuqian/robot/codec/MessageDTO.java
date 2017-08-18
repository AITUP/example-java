package com.xuqian.robot.codec;

import io.netty.channel.Channel;

import java.io.Serializable;
import java.util.Arrays;


public class MessageDTO implements Serializable {

    public static final int SENDONE = 1;
    public static final int SENDALL = 2;
    public static final int SENDALLEXCEPT = 3;

    private short commandCode;
    private byte[] data;
    private Channel channel;
    private int userId;
    private long now;
    private short erroCode;//错误码
    private int roomId;
    private int partRoomId;
    private int serverId;
    private int sendType;
    private long actorId;

    /***
     * 创建消息
     * @param commandCode
     * @param data
     * @return
     */
    public static MessageDTO valueOf(short commandCode,byte[] data) {
        MessageDTO dto = new MessageDTO();
        dto.commandCode = commandCode;
        dto.data = data;
        return dto;
    }


    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public short getCommandCode() {
        return commandCode;
    }

    public void setCommandCode(short commandCode) {
        this.commandCode = commandCode;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public int getDataLength() {
        if (data == null)
            return 0;
        return data.length;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public short getErroCode() {
        return erroCode;
    }

    public void setErroCode(short erroCode) {
        this.erroCode = erroCode;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getPartRoomId() {
        return partRoomId;
    }

    public void setPartRoomId(int partRoomId) {
        this.partRoomId = partRoomId;
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public int getSendType() {
        return sendType;
    }

    public void setSendType(int sendType) {
        this.sendType = sendType;
    }

    public long getActorId() {
        return actorId;
    }

    public void setActorId(long actorId) {
        this.actorId = actorId;
    }

    @Override
    public String toString() {
        return "MessageVO [commandCode=" + commandCode + ", data=" + Arrays.toString(data) + ", channel=" + channel
                + ", userId=" + userId + ", now=" + now + "]";
    }
}

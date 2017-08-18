package com.xuqian.robot.codec;


import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import java.util.List;

public class TcpDecoder extends io.netty.handler.codec.ByteToMessageDecoder{

    private final static byte[] SECXML = ("<cross-domain-policy> " + "<allow-access-from domain=\"*\" to-ports=\"1025-29999\"/>" + "</cross-domain-policy> " + "\n\0").getBytes();
    private final static byte[] TGW = "tigergame\r\nHost:192.168.30.20:8000\r\n\r\n".getBytes();


    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {

    }



}

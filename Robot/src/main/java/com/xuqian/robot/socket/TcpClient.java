package com.xuqian.robot.socket;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class TcpClient {

    private final String host;
    private final int port;

    public TcpClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void run() {

        EventLoopGroup group = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .option(ChannelOption.SO_KEEPALIVE, true)
                    .channel(NioSocketChannel.class)
                    .handler(new TcpClientInitializer(new TcpClientHandler()));

            ChannelFuture f = bootstrap.connect(host, port).sync();

            f.channel().writeAndFlush("hello hhhhhhh");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully();
        }
    }

    public void intoRoom() {

    }


}

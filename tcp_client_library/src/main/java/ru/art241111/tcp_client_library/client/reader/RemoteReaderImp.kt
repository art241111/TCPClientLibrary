package ru.art241111.tcpconnection.client.reader

import ru.art241111.tcpconnection.client.reader.handlers.HandlerImp
import java.net.Socket

/**
 * Interface that should implement the class that
 * will connect to read input data from the server.
 * @author Artem Gerasimov.
 */
interface RemoteReaderImp {
    fun destroyReader(){ }
    fun createReader(socket: Socket) { }

    fun addHandlers(handlers: List<HandlerImp>)
}
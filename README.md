# TCPConnectionLibrary
This library allows you to create a stable client for connecting to the server over the TCP Protocol.
## 0. Adding permissions and dependencies.
Add this library in `build.gragle` module level 
```
implementation 'com.github.art241111.try:try:0.0.1'
```

In `build.gradle` project level check google and jcenter repositories:
```
    repositories {
        google()
        jcenter()
    }
```

## 1. Creating a client and connecting to the server.
To connect to the server we need to create a client 
```
val client = Client()
```

Then connect to the server using the ip address and port of  
```
client.connect(address, port)
```

## 2. Subscribe to receive incoming data.
To subscribe to read incoming data, you need to create a class that will inherit from HandlerImp and then pass it to the addHandlers method.  
Or you this construction:  
```
      client.addHandler(
            object : HandlerImp {
                override fun handle(text: String) {
                    Log.d("on_handle", text)
                }
        })
```
## 3. Sending a message to the server.
To send a message to the server, you need to call the write method and pass the message to it.   
```
client.send("Hello")
```

## 4. Disconnecting from the server.
To disconnect from the server, call the disconnect method.  
```
client.disconnect()
```

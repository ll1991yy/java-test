
try:
    try:
        print(zoo(1).foo(2))
    except:
        print<caret>(zoo(0).foo(2))        # <- move statement up here
except:
    zoo(3)
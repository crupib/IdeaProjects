%%%-------------------------------------------------------------------
%%% @author williamcrupi
%%% @copyright (C) 2019, <COMPANY>
%%% @doc
%%%
%%% @end
%%% Created : 18. Oct 2019 5:11 PM
%%%-------------------------------------------------------------------
-module(helloworld).
-author("williamcrupi").

%% API
-export([hello_world/0]).
hello_world() -> io:fwrite("hello, world\n").

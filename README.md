First API

Hub:
- /onboarding
-- location: register participant

- /register participant 
-- id
-- location: games
-- access token

- /games
[games]

- /game/1
-- id
-- name
-- version
-- location: lobby

- /lobby/2
-- id
-- location: subscribe [access-token]
-- location: unsubscribe [access-token]
-- state [WAITING, ONGOING, ...]
-- location: broadcast

- /lobby/2/subscribe [access-token]
-- location: lobby broadcast [
START, 
NEXT_MOVE_PARTICIPANT(x, 60sec), 
PARTICIPANT_WON(x), 
END]

- /lobby/2/state 
-- board
-- participants [
	participant1 : {
		state: "steen"
	},
	participant2 : {
		state: "schaar" | undefined
	}
]
-- dateTime

- /lobby/2/state/participants/2 [access-token]
-- board
-- participants [
	participant1 : {
		state: "steen",
		emotion: "bluff"
	},
	participant2 : {
		state: "schaar",
		emotion: "depressed"
	}
]

- /lobby/2/participants/5/next-move [access-token]
- message: "blad"

- /lobby/2/state/results
- participant1: {
	score: 1,
	reason: "won",
}








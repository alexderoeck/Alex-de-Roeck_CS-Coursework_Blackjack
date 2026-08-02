<div align="center">

# --- Alex de Roeck ---

## A Level Computer Science Coursework

### Project Title: 'Blackjack Game & Learner'

</div>
<div align="left">

### Overview
**My A Level Computer Science coursework:** a single-player Blackjack game, coded in Java using Greenfoot, where you play against a computer-operated dealer. Built to double as a game and a learning/practice tool — no real money is used or gambled, and there's no age restriction as a result.

### The Idea
I regularly played Blackjack with friends without gambling real money, but don't know perfect strategy or card counting off by heart — this project was designed to let me (and others) practise those skills while also just being playable for fun.

### Research & Planning
Before building, I researched three existing browser Blackjack games (MSM Games, FreeGames, and The Washington Post Games) to identify strong and weak design choices — e.g. MSM Games' clear on-screen betting/instructions were a strong influence on my GUI layout, while FreeGames' overly childish design was something I deliberately avoided given my teen/adult target audience. I also ran a stakeholder survey to prioritise features (e.g. detailed vs. simplistic design, animations vs. sound effects, which features mattered most).

### Architecture
Built using an object-oriented approach, decomposed into distinct classes each planned with flowcharts and data dictionaries before coding:
- `DeckOfCards` & `Card` — deck creation, shuffling, and dealing
- `Player` & `Hand` — hand totals and turn state
- `Dealer` — dealer AI (stands on 17, draws to 16)
- `PokerChips` (with subclasses per chip value) — the betting system
- `MainGame` — overall game state and flow
- GUI classes — buttons, card/chip images, total-value counters, and an information outputter for round results

Each stage was developed and unit-tested individually (e.g. testing `shuffleDeck()`, `getCardValue()`, `getPlayerTurn()`) before being wired into the full game.

### What Works
Hit, Stand, Double Down, and Bust are all fully functional, alongside a complete interactive GUI — clickable poker chips for betting, live bet and hand-total counters, playing card images, and correct dealer logic including 3:2 Blackjack payouts and standing/drawing rules.

### What's Missing
Due to time constraints (a planning oversight around the dealer's turn and overall game flow ate into time budgeted for other features), several planned features were cut: a menu/options screen, a help menu explaining the rules, a toggleable Perfect Strategy cheat sheet, a Card Count counter, Splitting, and Insurance. These are documented in detail in the write-up's evaluation, alongside known bugs (e.g. Aces are currently always valued at 11 rather than 1 or 11, and the dealer getting Blackjack isn't specially detected) and what I'd fix first if continuing the project.

*Please see the attached PDF for the full analysis, design, iterative development (with code listings), testing, and evaluation.*

**Files:** PDF of my Word Document write-up, my Greenfoot code folder, testing screen recordings (ZIP file).
</div>

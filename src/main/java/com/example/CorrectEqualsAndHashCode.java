package com.example;

import java.util.Objects;

public class CorrectEqualsAndHashCode {




    class Card {
        private final int rank;

        Card(int rank) {
            this.rank = rank;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Card card = (Card) o;
            return rank == card.rank;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(rank);
        }
    }
}

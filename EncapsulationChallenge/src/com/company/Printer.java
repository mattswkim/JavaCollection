package com.company;

public class Printer {

  private int tonerLevel;
  private int pagesPrinted;
  private boolean isDuplex;

  public Printer(int tonerLevel, boolean isDuplex) {
    if(tonerLevel > -1 && tonerLevel <= 100) {
      this.tonerLevel = tonerLevel;
    } else {
      this.tonerLevel = -1;
    }
    this.pagesPrinted = 0;
    this.isDuplex = isDuplex;
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }

  public int fillUpToner(int tonerAmount) {
    if(tonerLevel > 0 && tonerAmount <= 100) {
      if(this.tonerLevel + tonerAmount > 100) {
        return -1;
      }
      return this.tonerLevel += tonerAmount;
    } else {
      return -1;
    }
  }

  public int printPages(int pages) {
    int pagesToPrint = pages;
    if(this.isDuplex) {
      pagesToPrint = (pages / 2) + (pages % 2);
      System.out.println("Printing in duplex mode");
    }

    return pagesPrinted += pagesToPrint;
  }

}

package com.quiktrak.utilities;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class PDFHeaderFooterPageEvent extends PdfPageEventHelper{
        Paragraph header;
        PdfTemplate total;
        public void setHeader(Paragraph header2) {
            this.header = header2;
        }
        public void onOpenDocument(PdfWriter writer, Document document) {
            total = writer.getDirectContent().createTemplate(30, 16);
        }
        public void onEndPage(PdfWriter writer, Document document) {
            PdfPTable table = new PdfPTable(3);
            PdfContentByte cb = writer.getDirectContent();
            try {
                //table.setWidths(new int[]{70, 16, 8});  //pagenation will be displayed
            	table.setWidths(new int[]{90, 0, 0});
                table.setTotalWidth(600);
                table.setLockedWidth(true);
                table.getDefaultCell().setFixedHeight(60);
                table.getDefaultCell().setBorder(Rectangle.BOTTOM);
                table.addCell(header);
                table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
                table.addCell(String.format("Page %d of", writer.getPageNumber()));
                PdfPCell cell = new PdfPCell(Image.getInstance(total));
                cell.setBorder(Rectangle.BOTTOM);
                table.addCell(cell);
                table.writeSelectedRows(0, -1, 34, 818, writer.getDirectContent());
                              
            }
            catch(DocumentException de) {
                throw new ExceptionConverter(de);
            }
        }
        public void onCloseDocument(PdfWriter writer, Document document) {
            ColumnText.showTextAligned(total, Element.ALIGN_LEFT, new Phrase(String.valueOf(writer.getPageNumber() - 1)),2, 2, 0);
        }
    }



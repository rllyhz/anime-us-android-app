package id.rllyhz.animeus.api.response_type;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PublishedTime {
    @SerializedName("from")
    @Expose
    private String fromStringFormat;
    @SerializedName("to")
    @Expose
    private String toStringFormat;
    @SerializedName("prop")
    @Expose
    private Prop prop;
    @SerializedName("string")
    @Expose
    private String stringFormat;

    public PublishedTime(String from, String to, Prop prop, String stringFormat) {
        this.fromStringFormat = from;
        this.toStringFormat = to;
        this.prop = prop;
        this.stringFormat = stringFormat;
    }

    public String getFromStringFormat() {
        return fromStringFormat;
    }

    public String getToStringFormat() {
        return toStringFormat;
    }

    public Prop getProp() {
        return prop;
    }

    public String getStringFormat() {
        return stringFormat;
    }

    /*
     * Prop type
     * */
    public class Prop {
        @SerializedName("from")
        @Expose
        private DateType from;
        @SerializedName("to")
        @Expose
        private DateType to;

        public Prop(DateType from, DateType to) {
            this.from = from;
            this.to = to;
        }

        public DateType getFrom() {
            return from;
        }

        public DateType getTo() {
            return to;
        }

        /*
         * Datetime type
         * */
        public class DateType {
            @SerializedName("day")
            @Expose
            private int day;
            @SerializedName("month")
            @Expose
            private int month;
            @SerializedName("year")
            @Expose
            private int year;

            public DateType(int day, int month, int year) {
                this.day = day;
                this.month = month;
                this.year = year;
            }

            public int getDay() {
                return day;
            }

            public int getMonth() {
                return month;
            }

            public int getYear() {
                return year;
            }
        }
    }
}

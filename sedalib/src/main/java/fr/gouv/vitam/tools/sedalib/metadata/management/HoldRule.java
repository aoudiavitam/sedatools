package fr.gouv.vitam.tools.sedalib.metadata.management;

import fr.gouv.vitam.tools.sedalib.metadata.content.Rule;
import fr.gouv.vitam.tools.sedalib.metadata.namedtype.*;
import fr.gouv.vitam.tools.sedalib.utils.SEDALibException;

import java.time.LocalDate;
import java.util.LinkedHashMap;

public class HoldRule extends RuleType {

    /**
            * Init metadata map.
     */
    @ComplexListMetadataMap(isExpandable = true)
    static final public LinkedHashMap<String, ComplexListMetadataKind> metadataMap;
    static {
        metadataMap = new LinkedHashMap<String, ComplexListMetadataKind>();
        metadataMap.put("HoldRuleGroup", new ComplexListMetadataKind(HoldRuleGroup.class, true));
        metadataMap.put("PreventInheritance", new ComplexListMetadataKind(BooleanType.class, false));
        metadataMap.put("RefNonRuleId", new ComplexListMetadataKind(StringType.class, true));
    }

    public HoldRule() {
        super("HoldRule");
    }
}
